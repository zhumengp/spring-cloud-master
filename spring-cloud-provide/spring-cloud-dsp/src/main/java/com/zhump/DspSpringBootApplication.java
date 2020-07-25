package com.zhump;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.zhump.dsp.dao"})
@EnableHystrix
@EnableFeignClients
public class DspSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DspSpringBootApplication.class,args);
    }
}
