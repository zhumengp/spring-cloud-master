package org.com.zhump;

import org.com.zhump.config.Swagger2Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableEurekaClient
@Import(Swagger2Configuration.class)
public class MsspSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsspSpringBootApplication.class,args);
    }
}
