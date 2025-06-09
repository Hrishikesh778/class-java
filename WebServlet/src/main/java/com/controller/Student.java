package com.controller;

public class Student {

	private int id;
	private String name;
	private int std;

	public Student(int id, String name, int std) {
		this.id = id;
		this.name = name;
		this.std = std;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getStd() {
		return std;
	}
	
}
