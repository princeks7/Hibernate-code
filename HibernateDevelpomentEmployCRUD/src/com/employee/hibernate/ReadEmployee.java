package com.employee.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employ.operation.entity.Employee;

public class ReadEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration()
                .configure("com/employee/jdbc/config/hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

		//create a session
		
		Session session = factory.getCurrentSession();
		
		try {
			// create a employee object
//						System.out.println("Creating new employee object...");
//						Employee tempEmployee = new Employee("Joseph", "Davis", "Alpha Testing Inc");
//						
//						// start a transaction
//						session.beginTransaction();
//						
//						// save the employee object
//						System.out.println("Saving the employee...");
//						System.out.println(tempEmployee);
//						session.save(tempEmployee);
//						
//						// commit transaction
//						session.getTransaction().commit();
						
						// MY NEW CODE
						
						// find out the employee's id: primary key
						//System.out.println("Saved employee. Generated id: " + tempEmployee.getEmpId());
						
						// now get a new session and start transaction
						session = factory.getCurrentSession();
						session.beginTransaction();
						
						// retrieve employee based on the id: primary key
						System.out.println("\nGetting employee with id: 1" );
						
						Employee myEmployee = session.get(Employee.class, 1);
						
						System.out.println("Get complete: " + myEmployee);
						
						// commit the transaction
						session.getTransaction().commit();
						
						System.out.println("Done!");
					}
					finally {
						factory.close();
					}	}
}