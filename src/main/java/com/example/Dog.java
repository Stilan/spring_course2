package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {

//    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public void say() {
        System.out.println("Bow - Wow");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @PostConstruct
//    protected void init() {
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    protected void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }
}

