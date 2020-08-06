package org.com.zhump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import zipkin2.server.internal.EnableZipkinServer;
//import zipkin2.storage.mysql.v1.MySQLStorage;
//import zipkin2.storage.mysql.v1.MySQLStorage;

import javax.sql.DataSource;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class SleuthSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthSpringBootApplication.class, args);
    }

//    @Bean
//    public MySQLStorage mySQLStorage(DataSource dataSource) {
//        return MySQLStorage.newBuilder().datasource(dataSource).executor(Runnable::run).build();
//    }

}
