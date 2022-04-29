package com.hidernate_many_to_many;

import com.hidernate_many_to_many.entity.Child;
import com.hidernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Section section = new Section("Dance");
//            Child child1 = new Child("Olya", 5);
//            Child child2 = new Child("Pavelik", 5);
//            Child child3 = new Child("Drisha", 5);
//            session.beginTransaction();
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//
//            session.persist(section);
//            session.getTransaction().commit();
//            System.out.println("Dona!!!");
//**************************************************

//            session = factory.getCurrentSession();
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Volleyball");
//            Section section3 = new Section("Volleyball");
//            Child child1 = new Child("Igor", 10);
//            child1.addSectionChild(section1);
//            child1.addSectionChild(section2);
//            child1.addSectionChild(section3);
//            session.beginTransaction();
//            session.save(child1);
//            session.getTransaction().commit();
//            System.out.println("Dona!!!");
            //*************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//
//
//            session.getTransaction().commit();
//            System.out.println("Dona!!!");
            //**************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//
//
//            session.getTransaction().commit();
//            System.out.println("Dona!!!");

            //*************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 7);
//            session.delete(section);
//
//
//
//            session.getTransaction().commit();
//            System.out.println("Dona!!!");
            session = factory.getCurrentSession();
            session.beginTransaction();
            Section section = session.get(Section.class, 7);
            session.delete(section);



            session.getTransaction().commit();
            System.out.println("Dona!!!");
        }
        finally {
           session.close();
           factory.close();
        }
    }








}
