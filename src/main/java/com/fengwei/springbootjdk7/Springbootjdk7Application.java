package com.fengwei.springbootjdk7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan({"com.fengwei","com.parrer"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Springbootjdk7Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootjdk7Application.class, args);
    }

}
