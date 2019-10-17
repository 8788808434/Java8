package com.advance.defaultfunctionalinterface;

import java.util.function.Function;

public class FunctionChanning {

	public static void main(String args[])
	{
		Function<Integer,String> p=(i)-> {
			
			if(i%2==0)
			{
				return "even";
			}
			else
			{
				return "odd";
			}
		};
		Function<String,String> p1=(i)->{
			return i+"";
		};
		System.out.println(p.andThen(p1).apply(52));
		//System.out.println(p.compose(p1).apply(52));
		//System.out.println(p1.andThen(p).apply(52));
	}
}
