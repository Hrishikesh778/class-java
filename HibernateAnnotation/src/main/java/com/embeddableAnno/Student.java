package com.embeddableAnno;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Student_Details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long rollno;
	
	@Column(name = "Student_Name", length = 25, nullable = true)
	public String name;
	
	
	public String std;
	
	@Transient
	public String college;
	
	public Address address;

	public Long getRollno() {
		return rollno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setRollno(Long rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", std=" + std + ", college=" + college + ", address="
				+ address + "]";
	}

	

	
}
