package com.aop.aspects;

import com.aop.Book;
import jdk.jshell.MethodSnippet;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* com.aop.UniLibrary.*(..))")
//    private  void allMethodsFromUniLibrary() {
// }
//
//    @Pointcut("execution( public void returnMagazine())")
//    private void returnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMethodsFromUniLibrary()")
//    private void allExceptReturnMethodsMagazineFromUniLibrary() {
//    }
//
//    @Before("allExceptReturnMethodsMagazineFromUniLibrary()")
//    public void beforeAllExceptReturnMethodsMagazineFromUniLibrary(){
//        System.out.println("beforeAllExceptReturnMethodsMagazineFromUniLibrary: writing Log #10");
//    }

// @Pointcut("execution(* com.aop.UniLibrary.get*())")
//    private  void allGetMethodsFromUniLibrary() {
// }
//
//    @Pointcut("execution(* com.aop.UniLibrary.return*())")
//    private  void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary()  || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){
//    }
//
//  @Before("allReturnMethodsFromUniLibrary()")
//  public void beforeReturnLoggingAdvice(){
//      System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//  }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnMethodsFromUniLibrary(){
//        System.out.println("beforeGetAndReturnMethodsFromUniLibrary: writing Log #3");
//    }




    @Before("com.aop.aspects.MyPointcut.allAddMethods()")
    public void beforeAddSecurityAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature "
                + methodSignature);
        System.out.println("methodSignature.getMethod() "
                + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() "
                + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() "
                + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments) {
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " +
                            myBook.getName() + ", автор - " + myBook.getAuthor() +
                            ", год издания - " + myBook.getYesrOfPublication()
                            );
                }
            }
        }
        System.out.println("beforeGetBookAdvice логирования попытки получить книгу/журнал");
        System.out.println("------------------------------------");
    }

}
