package com.advance.operation;

import java.util.Scanner;

public class Operation {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV");
		int no=sc.nextInt();
		switch(no)
		{
		case 1:
				System.out.println("Enter the two no u add");
				int c=sc.nextInt();
				int d=sc.nextInt();
				Finter f=(a,b)->a+b;
				System.out.println("ADDITION:"+f.op(c, d));
				break;
		case 2:
				System.out.println("Enter the two no u sub");
				int e=sc.nextInt();
				int g=sc.nextInt();
				Finter f1=(a,b)->a-b;
				System.out.println("SUBSTRACTION:"+f1.op(e, g));
				break;
				
		case 3:
				System.out.println("Enter the two no u multiply");
				int p=sc.nextInt();
				int q=sc.nextInt();
				Finter f2=(a,b)->a*b;
				System.out.println("MULTIPLICATION:"+f2.op(p, q));
				break;
				
		case 4:
				System.out.println("Enter the two no u divide");
				int r=sc.nextInt();
				int s=sc.nextInt();
				Finter f3=(a,b)->a/b;
				System.out.println("Divide:"+f3.op(r, s));
				break;
			
		}
	}
}
