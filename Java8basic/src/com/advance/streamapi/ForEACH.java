package com.advance.streamapi;

import java.util.ArrayList;

public class ForEACH {

	public static void main(String args[])
	{
		ArrayList<Student>s=new ArrayList<Student>();
		s.add(new Student(1,"para","agra",25.23));
		s.add(new Student(2,"gurkha","s",35.01));
		s.add(new Student(3,"nsg","delhi",85.12));
		s.stream().forEach(i->{
			System.out.println(s);
		});
	}
}
