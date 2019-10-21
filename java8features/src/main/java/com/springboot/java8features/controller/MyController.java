package com.springboot.java8features.controller;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.java8features.model.Student;
import com.springboot.java8features.service.Serviceinter;

@RestController
public class MyController {
	
	@Autowired
	Serviceinter s1;
	@RequestMapping(value="/Student",consumes="application/json",method=RequestMethod.POST)
	public void add(@RequestBody Student s)
	{
		s1.add(s);
	}
	

	@RequestMapping(value="/Student",produces="application/json",method=RequestMethod.GET)
	public List<Student> get()
	{
		List<Student> s2=s1.getAll();
		return s2;
	}
	
	@RequestMapping(value="/Student/list",produces="application/json",method=RequestMethod.GET)
	public List<Student> sortedlist()
	{
		return s1.sortedList();
	}
	
	@RequestMapping(value="/Student/sort",produces="application/json",method=RequestMethod.GET)
	public List<Student> sort()
	{
		List<Student> l=s1.agewise();
		return l;
		
	}
	
	
}
