package com.advance.primitive_version_predicate;


import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Simple {

	public static void main(String args[])
	{
		IntPredicate p=(i)->i%2==0;
		System.out.println(p.test(15));
	}
}
