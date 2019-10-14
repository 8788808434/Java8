package com.advance.example;

import java.util.ArrayList;
import java.util.Collections;

public class Second_Highest_sal {
	public static void main(String args[])
	{
		ArrayList<Employee> e=new ArrayList();
		e.add(new Employee(1,1.23f));
		e.add(new Employee(3,2.42f));
		e.add(new Employee(2,12.45f));
		e.add(new Employee(6,87.123f));
		
		Collections.sort(e,(e1,e2)->(e1.id>e2.id)?+1:(e1.id<e2.id)?-1:0);
		System.out.println(e);
		int s=e.size();
		float f=e.get(s-2).getSalary();
		System.out.println("salary:"+f);
	}

}
