package Logical;

public class StringSwap {

	public static void main(String[] args) {
	
		      String first="Hashim";
	          String second="Ansari";
		
	      System.out.println("\t Before Swap");	
	            System.out.println();
     System.out.println("   First Name---> = "+first);  
     System.out.println("   Second Name--> = "+second);
     
             // first=first+second;
            first=first.concat(second); 
     
      second =first.substring(0,first.length()-second.length());
      first =first.substring(second.length());  
      
  	                System.out.println();
 	          System.out.println("\t After Swap");  
 	                System.out.println();
      System.out.println("    First Name---> = "+first);
      System.out.println("    Second Name--> = "+second);
      
	}

}
