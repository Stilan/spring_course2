package com.hibernate_one_to_many_uni;




import com.hibernate_one_to_many_uni.entity.Department;
import com.hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("HR", 500, 1500);
//            Employee employee = new Employee("Oleg", "Ivanov", 800);
//            Employee employee2 = new Employee("Andrey", "Sidorov", 1000);
//            dep.addEmployeesToDepartment(employee);
//            dep.addEmployeesToDepartment(employee2);
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department); // помиима обьекта department мы получаем все связаные с ним объект
//            System.out.println(department.getEmps());
//            session.getTransaction().commit();
//**************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee); // помиима обьекта department мы получаем все связаные с ним объект
//            session.getTransaction().commit();
//**************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department = session.get(Department.class, 2);
            session.delete(department);

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }

    }
}
