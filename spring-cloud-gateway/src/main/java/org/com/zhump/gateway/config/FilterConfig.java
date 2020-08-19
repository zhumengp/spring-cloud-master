package org.com.zhump.gateway.config;

import lombok.extern.log4j.Log4j2;
import org.com.zhump.gateway.filter.TokenFilter;
import org.com.zhump.gateway.filter.UrlFilter;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@Log4j2
public class FilterConfig {

    @Bean
    public GlobalFilter tokenFilter() {
        return new TokenFilter();
    }




    @Bean
    public RouteLocator urlFilterRouteLocator(RouteLocatorBuilder builder) {
        log.info("FilterConfig---urlFilterRouteLocator---");
        return builder.routes()
                .route(r -> r.path("/mssp/**")
                        .filters(f -> f.stripPrefix (1).filter(new UrlFilter())
                                .addResponseHeader("urlFilterFlag", "pass"))
                        .uri("lb://MSSP")
                        .order(0)
                        .id("CompositeDiscoveryClient_MSSP")
                )
                .build();
    }

}
