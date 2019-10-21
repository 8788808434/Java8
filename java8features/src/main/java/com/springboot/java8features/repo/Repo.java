package com.springboot.java8features.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.java8features.model.Student;

public interface Repo extends CrudRepository<Student,Integer>{

}
