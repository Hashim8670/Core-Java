package Logical;

public class Sum {

	public static void main(String[] args) {
		int a= 1;
		int b = 2;
		for(int i=0;i<3; i++) {
			
		a = a++ + ++b;
		b = b++ + ++a;
		}
		System.out.println(a);
	   System.out.println(b);
	}
  	
}
