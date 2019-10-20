package com.advance.streamapi;

import java.util.ArrayList;

public class Streaming_count {

	public static void main(String args[])
	{
		ArrayList<Student> s=new ArrayList<Student>();
		s.add(new Student(1,"Avinash","DIGHI",75.23));
		s.add(new Student(2,"Prasad","ALANDI",85.23));
		s.add(new Student(3,"Sandip","Nagar",96.25));
		s.add(new Student(4,"Shubham","pimple-nilakh",23.12));
		long a=s.stream().filter(m->m.getPercentage()>85).count();
		System.out.println("candidates are ther:"+a);
	}
}
