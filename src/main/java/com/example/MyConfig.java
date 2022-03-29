package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.example")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet carBean() {
       return  new Cat();
    }

    @Bean
    public Persson perssonBean() {
        return new Persson(carBean());
    }
}
