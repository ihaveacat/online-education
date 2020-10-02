package com.atguigu.guli.service.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
@ComponentScan({"com.atguigu.guli"})
public class ServiceEduApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceEduApplication.class, args);
    }
}
