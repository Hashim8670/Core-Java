package Logical;

public class SwapNuumber {
       public static void main(String[] args) {
		   int a=12;
		   int b=10;
		   
		   System.out.println("A = "+a+" : "+"B = "+b);
		   
		   int c=a+b;
		       a=c-a;
		       b=c-b;
		   
		   System.out.println("A = "+a+" : "+"B = "+b);    
	}
}
