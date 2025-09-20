package com.operators.java;

public class logicalOperator {

	public static void main(String[] args) {
		
		int a=4;
		int b=5;
		
		System.out.println(a>=b && b>=a);
		System.out.println(a>=b || a<=b);
		System.out.println(!( b>=a ));
	}

}
