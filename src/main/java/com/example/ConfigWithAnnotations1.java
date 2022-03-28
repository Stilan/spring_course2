package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Persson persson = context.getBean("perssonBean", Persson.class);
        persson.callYourPet();

//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();
        System.out.println(persson.getSurname());
        System.out.println(persson.getAge());


        context.close();
    }
}
