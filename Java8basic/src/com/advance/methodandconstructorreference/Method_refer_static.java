package com.advance.methodandconstructorreference;

public class Method_refer_static {

	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Method_referstatic m=Method_refer_static::add;
		m.add(15, 16);
	}
}
