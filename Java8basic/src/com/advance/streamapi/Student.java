package com.advance.streamapi;

public class Student {

	private int id;
	private String name;
	private String address;
	private double percentage;
	public Student(int id, String name, String address, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.percentage = percentage;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", percentage=" + percentage + "]";
	}
	
	
}
