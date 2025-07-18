package org.locator_strategies;

public class A {
	
	public static int add(int a, int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10,20));
		int sum = add(30,40);
		System.out.println(sum);
		System.out.println(add(210,60));
	}	
}
