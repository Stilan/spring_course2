package com.example;

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

    protected void init() {
        System.out.println("Class Dog: init method");
    }

    protected void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}

