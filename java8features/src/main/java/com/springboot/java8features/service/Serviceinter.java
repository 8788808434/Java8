package com.springboot.java8features.service;

import java.util.List;

import com.springboot.java8features.model.Student;

public interface Serviceinter {

	public void add(Student s);
	public List<Student> getAll();
	public List<Student> sortedList();
	public List<Student> agewise();
}
