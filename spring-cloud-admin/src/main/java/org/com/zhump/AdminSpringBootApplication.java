package org.com.zhump;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *监控平台启动类
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class AdminSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminSpringBootApplication.class,args);
    }
}
