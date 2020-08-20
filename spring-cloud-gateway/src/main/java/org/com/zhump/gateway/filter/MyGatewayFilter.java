package org.com.zhump.gateway.filter;

import lombok.extern.log4j.Log4j2;
import org.com.zhump.gateway.constant.GatewayConstant;
import org.com.zhump.gateway.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.http.server.RequestPath;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Log4j2
public class MyGatewayFilter implements GlobalFilter, Ordered {

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("MyGatewayFilter开始............");
        URI uri = exchange.getRequest().getURI();
        log.info("MyGatewayFilter开始............URI==="+uri.toString());
        HttpMethod method = exchange.getRequest().getMethod();
        log.info("MyGatewayFilter开始............HttpMethod==="+method.toString());
        String methodValue= exchange.getRequest().getMethodValue();
        log.info("MyGatewayFilter开始............getMethodValue==="+methodValue);
        RequestPath requestPath =exchange.getRequest().getPath();
        log.info("MyGatewayFilter开始............RequestPath==="+requestPath.toString());
        InetSocketAddress inetSocketAddress =exchange.getRequest().getRemoteAddress();
        log.info("MyGatewayFilter开始............InetSocketAddress==="+inetSocketAddress.toString());
        //放入redis
        String token = redisUtils.createToken(GatewayConstant.SECRET_KEY);
        //拦截的逻辑。根据具体业务逻辑做拦截。
        ServerHttpRequest request = exchange.getRequest().mutate()
                .headers(httpHeaders -> httpHeaders.remove(GatewayConstant.SECRET_KEY))
                .build();
        ServerHttpRequest newRequest = request.mutate().header(GatewayConstant.SECRET_KEY,token).build();
        return chain.filter(exchange.mutate().request(newRequest.mutate().build()).build());

    }

    @Override
    public int getOrder() {
        return -999;
    }
}
