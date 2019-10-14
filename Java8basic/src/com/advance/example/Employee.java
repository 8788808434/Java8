package com.advance.example;

public class Employee {

	int id;
	float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public Employee(int id, float salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
	
	
}
