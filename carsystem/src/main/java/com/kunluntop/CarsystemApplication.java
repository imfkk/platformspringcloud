package com.kunluntop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.kunluntop.mapper")
/*@EnableFeignClients("com.kunluntop.api.cars")*/
//@ComponentScan("com.kunluntop.api.cars")
//@ComponentScan({"com.kunluntop"})
public class CarsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsystemApplication.class, args);
    }

}
