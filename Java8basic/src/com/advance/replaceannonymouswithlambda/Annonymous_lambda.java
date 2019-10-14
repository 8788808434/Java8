package com.advance.replaceannonymouswithlambda;

public class Annonymous_lambda {

	public static void main(String args[])
	{
		/*
		 * Fannonymous_lambda f=new Fannonymous_lambda() {
		 * 
		 * @Override public void m1() { System.out.println("Hii i am java developer");
		 * 
		 * }
		 * 
		 * }; f.m1();
		 */
	
		//above annonymous inner class we can replace with lambda expression when there is only one abstract method is there in functional interface
		Fannonymous_lambda fm=()->System.out.println("hii i am java developer");
		fm.m1();
	}
}
