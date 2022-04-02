package com.aop.aspects;

import com.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов перед метдом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameStudent = firstStudent.getNameSurname();
//        nameStudent = "Mr. " + nameStudent;
//        firstStudent.setNameSurname(nameStudent);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение " +
//                "списка студентов после работы метда getStudents");
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())"
                    ,throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс исключения " + exception);
    }

}
