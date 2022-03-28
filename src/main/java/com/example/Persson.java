package com.example;

public class Persson {
    private Pet pet;

//    public Persson(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Persson() {
        System.out.println("Person bean is created");
    }
// pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

}
