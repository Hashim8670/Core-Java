package CoreJava;

import java.util.Scanner;

public class Prime {
	    public static void main(String[] args) {
	         Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter a Number:");
               int a=sc.nextInt();
	        for (int i=2; i<=a; i++) {
	            boolean isPrime = true;
	            for (int j=2; j<=i/2; j++) {
	                if (i%j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime && i>1) {
	                System.out.print(i+",");
	            sc.close(); 
	            }
	        }
	    }
	}

