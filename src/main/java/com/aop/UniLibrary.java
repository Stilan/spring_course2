package com.aop;

import org.springframework.stereotype.Component;

@Component
public  class UniLibrary extends AbstractLibrary {


    public void getBook(){
        System.out.println("Мы берем книгу UniLibrary ");
        return;
    }

     public void returnBook() {
        System.out.println("Мы возвращаем книгу UniLibrary");

    }

    public void getMagazine(){
        System.out.println("Мы берем журнал UniLibrary");
        return;
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал UniLibrary");

    }

    public void addBook() {
        System.out.println("Мы добовляем книгу в UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Мы добовляем журнал в UniLibrary");
    }
}
