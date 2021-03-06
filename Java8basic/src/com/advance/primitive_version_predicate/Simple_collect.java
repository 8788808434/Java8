package com.advance.primitive_version_predicate;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class Simple_collect {

	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(0);
		a.add(20);
		a.add(15);
		a.add(25);
		a.add(19);
		
		IntPredicate p=i->i>12 && i<20;
		Consumer<Integer> c=c1->{
			for(Integer i:a)
			{
			if(p.test(i))
			{
				System.out.println(c1);
			}
			}
		};
		a.stream().forEach(c);
	}
}
