package com.example;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("myApp.properties")
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
