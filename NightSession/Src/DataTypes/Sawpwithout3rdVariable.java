package DataTypes;

public class Sawpwithout3rdVariable {
	public static void main(String[] args) {
		
      int a=7;
      int b=5;
      
         System.out.println("Before Swap");
         System.out.println("No a : "+a);
         System.out.println("No b : "+b);
         
       a=a+b; 
       b=a-b;
       a=a-b;
       System.out.println("After Swap");
       System.out.println("No a : "+a);
       System.out.println("No b : "+b);
       
	}
}