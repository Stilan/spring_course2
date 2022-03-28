package com.example;

public class Persson {
    private Pet pet;

    public Persson(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

}
