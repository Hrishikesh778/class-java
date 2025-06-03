package com.spring;

public class Employee2 {
	public long id;
	public String name;
	public String location;
	
	public Address address;

	public Employee2(long id, String name, String location, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.address = address;
	}

	public Employee2() {
		super();
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", location=" + location + ", address=" + address + "]";
	}
	
	
}
