package com.employee.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employ.operation.entity.Employee;


public class CreateEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				                 .configure("com/employee/jdbc/config/hibernate.cfg.xml")
				                 .addAnnotatedClass(Employee.class)
				                 .buildSessionFactory();
		
		//create session
		
		Session session = factory.getCurrentSession();
		
		try {
			
			// Creating Entries of employee
			
			System.out.println("Creating Emplyee object");
			
			Employee emp1 = new Employee("Prince", "Sing", "TCS");
			Employee emp2= new  Employee("Mary","Wall","Wipro");
			Employee emp3 = new Employee("Ramesh","kumar","IBM");
			
			// start a transaction
			session.beginTransaction();
			
			//saving the EMployee object
			
			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
			
			//commit transaction
			
			session.getTransaction().commit();
			
			System.out.println("Done");
		}
		finally {
			factory .close();
		}
		
	}

}
