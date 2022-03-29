package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Persson persson = context.getBean("perssonBean", Persson.class);
        persson.callYourPet();

        context.close();

    }
}
