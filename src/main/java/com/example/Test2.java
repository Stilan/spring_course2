package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Spring Contner известин под именем applicationContext
        // Получения bean
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
