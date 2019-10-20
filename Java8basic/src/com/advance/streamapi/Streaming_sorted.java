package com.advance.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Streaming_sorted {

	public static void main(String args[])
	{
		ArrayList<Student> s=new ArrayList<Student>();
		s.add(new Student(1,"Avinash","Dighi",45.23));
		s.add(new Student(2,"prasad","Alandi",33.23));
		s.add(new Student(3,"shubham","pune",58.21));
		s.add(new Student(4,"sandip","nagar",47.23));
		s.add(new Student(5,"Akshay","wadi",58));
		s.add(new Student(6,"pradip","latur",82));
		List<Student> l=s.stream().sorted((i,i1)->i.getName().compareTo(i1.getName())).collect(Collectors.toList());
		List<Student> l1=s.stream().sorted((i,i1)->i.getPercentage()>i1.getPercentage()?-1:i.getPercentage()<i1.getPercentage()?1:0).collect(Collectors.toList());
		System.out.println("NAME WISE:");
		Consumer<Student> c=c1->
		{
			System.out.println(""+c1.getId());
			
		};
		l.stream().forEach(c);
		System.out.println("Percentage wise:");
		l1.stream().forEach(c);
	}
}
