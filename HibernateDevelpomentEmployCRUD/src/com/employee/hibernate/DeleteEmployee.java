package com.employee.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employ.operation.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create session factory
				SessionFactory factory = new Configuration()
		                .configure("com/employee/jdbc/config/hibernate.cfg.xml")
		                .addAnnotatedClass(Employee.class)
		                .buildSessionFactory();
		// create session
				Session session = factory.getCurrentSession();
				
				try {								
					int employeeId = 1;
					
					// now get a new session and start transaction
					session = factory.getCurrentSession();
					session.beginTransaction();
					
					// retrieve employee based on the id: primary key
					System.out.println("\nGetting employee with id: " + employeeId);
					
					Employee myEmployee = session.get(Employee.class, employeeId);
					
					// delete the employee
					System.out.println("Deleting employee: " + myEmployee);
					session.delete(myEmployee);
								
					// commit the transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}
				finally {
					factory.close();
				}
			}

	



	

}
