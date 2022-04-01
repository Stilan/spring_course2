package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("com.aop.aspects.MyPointcut.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: " +
                "ловим/обрабатываем исключения при попытки получить книгу/журнал");
    }
}