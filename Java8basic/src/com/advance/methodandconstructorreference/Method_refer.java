package com.advance.methodandconstructorreference;

public class Method_refer implements Methodfreference{
	
	

	public static void main(String args[])
	{
		/*
		 * 1.method reference we will take for reusability of code
		 * 2.method reference is the alternative to lambda expression.
		 * 3.using :: operator
		 * 4.one restriction is that mothod arguments must be same.
		 * 5.if static method then use classname::method name
		 * 6.if non-static method then reference::class-name
		 * 7.method implementation already available then go for method reference otherwise go for lambda expression. 
		 * */
		Method_refer m=new Method_refer();
		Methodfreference f=m::sum;
		f.sum();
		
		
	}

	@Override
	public void sum() {
		System.out.println("hi thse is sum");
		
	}
}
