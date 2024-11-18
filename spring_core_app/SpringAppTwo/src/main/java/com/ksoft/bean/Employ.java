package com.ksoft.bean;

public class Employ {

	private int id;
	private String name;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {

		System.out.println("Employ.setId()");
		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		System.out.println("Employ.setName()");
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Employ.setSalary()");
		this.salary = salary;
	}

}
