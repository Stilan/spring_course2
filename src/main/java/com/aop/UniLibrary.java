package com.aop;

import org.springframework.stereotype.Component;

@Component
public  class UniLibrary extends AbstractLibrary {

   @Override
    public void getBook(){
        System.out.println("Мы берем книгу UniLibrary");
        return;
    }

     String returnBook() {
        System.out.println("Мы возвращаем книгу UniLibrary");
        return "Ok";
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал UniLibrary");
        return;
    }
}
