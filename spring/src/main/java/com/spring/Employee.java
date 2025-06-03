package com.spring;

public class Employee {
	public long id;
	public String name;
	public String location;
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Employee() {
		super();
	}
	
	public Employee(long id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	
}
