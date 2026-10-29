package org.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                        .configure("hibernate.cfg.xml")
                        .buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        //----------------Create/Insert-----------------
//        Employee employee = new Employee(105, "stev", "tl");
//        session.persist(employee);
//        System.out.print(employee.toString());

        //-----------------Read/Fetch-------------------
//        Employee employee=session.find(Employee.class,104);
//        System.out.print(employee);

        //-------------------Update----------------------
//        Employee emp = new Employee(101, "vivek", "CEO");
//        Employee managedEmp = session.merge(emp);
//        System.out.print(managedEmp);

        //--------------------Delete----------------------
        Employee employee=session.find(Employee.class,105);
        session.remove(employee);

        transaction.commit();
        session.close();
        factory.close();
    }
}