package com.zhump;

import org.com.zhump.config.Swagger2Config;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.zhump.dsp.dao"})
@EnableHystrix
@EnableFeignClients
@Import(Swagger2Config.class)
public class DspSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DspSpringBootApplication.class,args);
    }
}
