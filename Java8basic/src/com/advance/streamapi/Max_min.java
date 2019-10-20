package com.advance.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Max_min {
	public static void main(String args[])
	{
		ArrayList<Student>s=new ArrayList<Student>();
		s.add(new Student(1,"Avinash","Dighi",45.23));
		s.add(new Student(2,"prasad","Alandi",33.23));
		s.add(new Student(3,"shubham","pune",58.21));
		s.add(new Student(4,"sandip","nagar",47.23));
		s.add(new Student(5,"Akshay","wadi",58));
		s.add(new Student(6,"pradip","latur",82));
		
		Student max=s.stream().max((i,i1)->-i.getAddress().compareTo(i1.getAddress())).get();
		System.out.println("Max:"+max);
		Student min=s.stream().min((i,i1)->i.getAddress().compareTo(i1.getAddress())).get();
		System.out.println("min"+min);
	}

}
