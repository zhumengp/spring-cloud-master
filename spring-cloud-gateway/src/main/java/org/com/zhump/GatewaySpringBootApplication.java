package org.com.zhump;

import org.com.zhump.gateway.filter.MyGatewayFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

/**
 * 服务网关
 */
@SpringBootApplication
@EnableEurekaClient
@Import(MyGatewayFilter.class)
public class GatewaySpringBootApplication {

    public static void main(String[] args) {
        System.out.println();
        SpringApplication.run(GatewaySpringBootApplication.class,args);
    }



}
