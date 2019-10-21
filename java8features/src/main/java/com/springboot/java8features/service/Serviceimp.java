package com.springboot.java8features.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.java8features.model.Student;
import com.springboot.java8features.repo.Repo;
@Service
public class Serviceimp implements Serviceinter{

	@Autowired
	Repo r;
	@Override
	public void add(Student s) {
		
		r.save(s);
	}
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return (List<Student>) r.findAll();
	}
	@Override
	public List<Student> sortedList() {
		List<Student>s=(List<Student>) r.findAll();
		List<Student> s1=s.stream().filter(i->i.getAge()>10).collect(Collectors.toList());
		return s1;
	}
	@Override
	public List<Student> agewise() {
		List<Student>s=(List<Student>) r.findAll();
		List<Student> l=s.stream().sorted((i,i1)->i.getAge()>i1.getAge()?1:i.getAge()<i1.getAge()?-1:0).collect(Collectors.toList());
		
		return l;
	}

}
