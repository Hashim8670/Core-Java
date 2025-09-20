package ExceptionHandling;

public class Arithmetic {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}
         catch(ArithmeticException c){
        	 c.printStackTrace();
        	 System.out.println(c);
        	 System.out.println(c.getMessage());
         }

				
	}

}
