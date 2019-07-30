package com.kunluntop.carsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.kunluntop.carsystem.mapper")
@EnableFeignClients(basePackages="com.kunluntop.api.cars")
@ComponentScan("com.kunluntop.api.cars")
public class CarsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsystemApplication.class, args);
    }

}
