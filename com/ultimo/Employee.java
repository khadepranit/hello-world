package com.ultimo;

public class Employee {

	private String empname;
	private int age;
	
	public Employee(String empname, int age) {
		super();
		this.empname = empname;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", age=" + age + "]";
	}
	
	
}
