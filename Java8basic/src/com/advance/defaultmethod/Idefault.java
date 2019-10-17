package com.advance.defaultmethod;
public interface Idefault {

	public void m2();
	public void m3();
	default void m1()//without affecting implementation class if we want add some method inside interface then we go with default method
	{
		System.out.println("hii these is default method");
	}
}
