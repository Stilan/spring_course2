package com.aop;

import org.springframework.stereotype.Component;

@Component
public  class UniLibrary extends AbstractLibrary {


    public void getBook(Book book){
        System.out.println("Мы берем книгу UniLibrary " + book.getName());
        return;
    }

//     String returnBook() {
//        System.out.println("Мы возвращаем книгу UniLibrary");
//        return "Ok";
//    }

    public void getMagazine(){
        System.out.println("Мы берем журнал UniLibrary");
        return;
    }
}
