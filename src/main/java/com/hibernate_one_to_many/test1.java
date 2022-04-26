package com.hibernate_one_to_many;



import com.hibernate_one_to_many.entity.Department;
import com.hibernate_one_to_many.entity.Employee;
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
//            Department dep = new Department("Sales", 800, 1500);
//            Employee employee = new Employee("Zaur", "Tregulov", 800);
//            Employee employee2 = new Employee("Elena", "Smirnova", 1500);
//            Employee employee3 = new Employee("Anton", "Sidorov", 1200);
//
//            dep.addEmployeesToDepartment(employee);
//            dep.addEmployeesToDepartment(employee2);
//            dep.addEmployeesToDepartment(employee3);
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//**************************************************

            session = factory.getCurrentSession();

            session.beginTransaction();
            System.out.println("Get department");
            Department department = session.get(Department.class, 3);

            System.out.println("Show department");
            System.out.println(department);// помиима обьекта department мы получаем все связаные с ним объект

            System.out.println("Просто подгрузим Employees");

            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());
//**************************************************
//
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
//
//            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }

    }
}
