package com.advance.annonymouswithchildclass;

public class ImplementedClass {

	public static void main(String args[])
	{
		Employee e=new Employee()
		{
			public void m1()
			{
				System.out.println("hii i am php developer");
			}
		};
		e.m1();
	}
}
