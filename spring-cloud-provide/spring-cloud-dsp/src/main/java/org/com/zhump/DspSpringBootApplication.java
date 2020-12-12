package org.com.zhump;

import org.com.zhump.config.Swagger2Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"org.com.zhump.dsp.dao"})
@EnableHystrix
@EnableFeignClients
@Import(Swagger2Configuration.class)
public class DspSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DspSpringBootApplication.class,args);
    }
}
