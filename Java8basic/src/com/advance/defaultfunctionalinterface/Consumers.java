package com.advance.defaultfunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Consumers {

	public static void main(String args[])
	{
		ArrayList<Cricketerinfo> l=new ArrayList<>();
		l.add(new Cricketerinfo(1,"avinash",15000,50,125,99.99));
		l.add(new Cricketerinfo(2,"prasad",15987,54,253,78.23));
		l.add(new Cricketerinfo(3,"Sandip",25689,78,1,54.23));
		l.add(new Cricketerinfo(4,"Akshay",1,15,0,0));
		Predicate<Cricketerinfo> cr=c2->c2.getTotalruns()>15000 && c2.getTotalruns()<20000;
		
		Consumer<Cricketerinfo> c=c1->{
			System.out.println("id:"+c1.getNo());
			System.out.println("Name:"+c1.getName());
			System.out.println("TotalRuns:"+c1.getTotalruns());
			System.out.println("Crntury:"+c1.getCenture());
		};
		
		Supplier<List<Cricketerinfo>>s=()->
		{
			return l;
		};
		for(Cricketerinfo c3:l)
		{
			if(cr.test(c3))
			{
				c.accept(c3);;
			}
		}
		
		System.out.println(s.get());
	}
}
