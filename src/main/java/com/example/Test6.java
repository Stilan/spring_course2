package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Persson persson = context.getBean("perssonBean", Persson.class);
        persson.callYourPet();
        System.out.println(persson.getAge());
        System.out.println(persson.getSurname());

//        Pet cat1 = context.getBean("carBean", Pet.class);
//        Pet cat2 = context.getBean("carBean", Pet.class);
//        cat1.say();

        context.close();

    }
}
