package com.hibernate_test;

import com.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class test4 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1500);
            session.createQuery("UPDATE Employee set salary = 1000 "
            + " where name = 'Elena'").executeUpdate();
            session.getTransaction().commit();



        } finally {
            factory.close();
        }

    }
}
