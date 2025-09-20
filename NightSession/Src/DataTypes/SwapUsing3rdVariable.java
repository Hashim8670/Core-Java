package DataTypes;

public class SwapUsing3rdVariable {
   public static void main(String[] args) {
	  
	   int a=15;
	   int b=5;
	   System.out.println("Before Swap");
	   System.out.println("No a : "+a);
	   System.out.println("No b : "+b);
	   
	   int c=a;
	       a=b;
	       b=c;
	   System.out.println("After Swap");  
	   System.out.println("No a : "+a);
	   System.out.println("No b : "+b);
  }
   
}
