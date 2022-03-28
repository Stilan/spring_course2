package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("perssonBean")
public class Persson {
    @Autowired
    private Pet pet;
    private String surname;
    private int age;

//    @Autowired
//    public Persson(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Persson() {
        System.out.println("Person bean is created");
    }
// pet -> setPet
//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: anyMethodName");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
