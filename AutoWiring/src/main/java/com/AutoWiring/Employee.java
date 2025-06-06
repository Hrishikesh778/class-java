package com.AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	
	long id;
	String name;
	
	@Autowired
//	@Qualifier("ad2")
	Address address;
	 
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
	public Address getAddress() {
		return address;
	}
	
	
//	if we add qualifier here it will see if ad2 is available or not else it will select the one whic is available
	public void setAddress(@Qualifier("ad2") Address address) {
		this.address = address;
	}
	public Employee() {
		super();
	}
	public Employee(long id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
