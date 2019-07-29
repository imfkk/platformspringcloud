package com.kunluntop.carsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.kunluntop.carsystem.mapper")
public class CarsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsystemApplication.class, args);
    }

}
