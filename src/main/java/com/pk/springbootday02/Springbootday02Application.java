package com.pk.springbootday02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.pk.springbootday02.mapper"})
public class Springbootday02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootday02Application.class, args);
    }

}
