package com.employ.operation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int EmpId;
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="company_name")
	private String companyName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Employee(String firstName, String lastName, String companyName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", firstName=" + firstName + ", lastName=" + lastName + ", companyName="
				+ companyName + "]";
	}
	
public Employee() {
		
	}

	
	
	
	

}
