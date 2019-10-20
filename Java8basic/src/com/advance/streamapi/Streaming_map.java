package com.advance.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Streaming_map {

	public static void main(String args[])
	{
		ArrayList<Student>s=new ArrayList<Student>();
		s.add(new Student(1,"Avinash","DIGHI",75.23));
		s.add(new Student(2,"Prasad","ALANDI",85.23));
		s.add(new Student(3,"Sandip","Nagar",96.25));
		s.add(new Student(4,"Shubham","pimple-nilakh",23.12));
		
		List<String> l=s.stream().map(m->"POST-"+m.getAddress()).collect(Collectors.toList());
		System.out.println(l);
		Consumer<String>c=p->{
			System.out.println(p);
		};
		l.stream().forEach(c);
	}
}
