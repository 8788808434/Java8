package com.advance.defaultmethod;

public class Default_method implements Idefault{

	public static void main(String args[])
	{
		Idefault m=new Default_method();
		Idefault n=new Normal();
		m.m1();
		m.m2();
		m.m3();
		n.m1();
		
	}

	@Override
	public void m2() {
		System.out.println("these is m2");
		
	}

	@Override
	public void m3() {
		System.out.println("these is m3");
		
	}
}
