package com.advance.defaultfunctionalinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicat {

	//1.predicate functional interface is use for conditional statements
	//2.contains test() and have boolean return type
	public static void main(String args[])
	{
		ArrayList<Employee> l=new ArrayList<>();
		l.add(new Employee(1,"Avinash",2000.0));
		l.add(new Employee(2,"prasad",3000.25));
		l.add(new Employee(3,"nelish",4500.12));
		
		Predicate<Employee> p=(e)->e.getSalary()>2000;
		for(Employee e1:l)
		{
			if(p.test(e1))
			{
				System.out.println("Employee name:"+e1.getName());
				System.out.println("Employee salarey:"+e1.getSalary());
			}
		}
		
		
	}
}
