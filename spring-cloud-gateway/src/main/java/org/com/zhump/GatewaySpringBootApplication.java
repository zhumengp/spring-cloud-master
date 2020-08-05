package org.com.zhump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务网关
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewaySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewaySpringBootApplication.class,args);
    }
}
