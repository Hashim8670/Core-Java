package Logical;

import java.util.Scanner;

public class FindRemainder {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Divisor");
		int a=sc.nextInt();
		
		System.out.println("Enter a divident");
		int b=sc.nextInt();
		float f=a/b;
		float ramainder=a-b*f;
		System.out.println(ramainder);
		sc.close();
	}

}
