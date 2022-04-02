package com.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("com.aop.aspects.MyPointcut.allAddMethods()")
    public void beforeAddLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: проверка прав на получения книги/журнала");
        System.out.println("------------------------------------");
    }


}
