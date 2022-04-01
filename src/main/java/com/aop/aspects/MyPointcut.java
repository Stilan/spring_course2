package com.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* get*())")
    public void allGetMethods() {}
}