package com.advance.defaultfunctionalinterface;

import java.util.ArrayList;
import java.util.function.Function;

public class Functions {

	
	public static  void main(String args[])
	{
		
		ArrayList<Cricketerinfo> a=new ArrayList();
		a.add(new Cricketerinfo(1,"sachin",10000,51,94,54.23));
		a.add(new Cricketerinfo(2,"v.kohli",11000,43,55,54));
		a.add(new Cricketerinfo(3,"MS Dhoni",10500,11,73,51));
		a.add(new Cricketerinfo(4,"Avinash",32000,76,99,91.12));
		
		Function<Cricketerinfo,String> p=c->{
			String s="";
			if(c.getAverage()<52)
			{
				 s=c.getName();
				
			}
			return s;
		};
		
			for(Cricketerinfo c:a)
			{
			System.out.println(p.apply(c));
			}
		}
		
	}

