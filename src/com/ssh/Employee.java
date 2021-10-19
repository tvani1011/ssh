package com.ssh;

public class Employee {
	private String empname;
	private String department;

	public Employee(String empname, String department) {
		super();
		this.empname = empname;
		this.department = department;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("vani", "java");
		Employee emp2 = new Employee("madhu", "react");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());

	}

}
