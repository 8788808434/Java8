package com.advance.table;

import java.util.Scanner;

public class Any_Table {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int n=sc.nextInt();
		Finters f=a->{
			System.out.println("TABLE:"+a);
			for(int i=1;i<=10;i++)
			{
				System.out.println(a*i);
			}
		};
		f.table(n);
	}
}
