package com.HibernateAnnotation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Data")

public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public long id;
	
	@Column(name ="Employee_Name")
	public String name;
	public Double salary;
	public Boolean isActive;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Employee(long id, String name, Double salary, Boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.isActive = isActive;
	}
	
	public Employee( String name, Double salary, Boolean isActive) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.isActive = isActive;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", isActive=" + isActive + "]";
	}
	
	
}
