package Logical;

import java.util.Scanner;

public class PalindromeScanner {

	public static void main(String[] args) {
		 {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number" );
			int a = sc.nextInt();
			int b = a;
			int res =  0;
			while(a>0) {
				int c = a %  10;
				res = res*10 + c;
				a = a/10;
			}
			if(b == res) {
				System.out.println(b+" : Is Palindrome Number");
			}
			else
				System.out.println(b+" : is not A Palindrome Number");
			sc.close();
		}
		
	}

}
