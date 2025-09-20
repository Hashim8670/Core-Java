package Logical;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		
		int num=sc.nextInt();
		int fact=1;
		
		for(int i=1; i<=num; i++) {
			fact=fact*i;
			System.out.print(fact+",");
			
		sc.close();	
		}
		
	}

}
