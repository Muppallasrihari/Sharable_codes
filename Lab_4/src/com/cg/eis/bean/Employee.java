package com.cg.eis.bean;

public class Employee {
	private static long id;
	private String name;
	private double salary;
	private String designation;
	private String insurancescheme;

	public static long getId() {
		return id;
	}

	public static void setId(long id) {
		Employee.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsurancescheme() {
		return insurancescheme;
	}

	public void setInsurancescheme(String insurancescheme) {
		this.insurancescheme = insurancescheme;
	}
}
