package Logical;

public class StringBuilder1{

	public static void main(String[] args) {
		String str="sos";
		StringBuilder  sb=new StringBuilder(str);
		// System.out.println(sb.reverse());
         String str1=sb.reverse().toString();
		 
	if(str.equals(str1)) {
		System.out.println(str+" is Palindrome String");
	}
	else {
	   System.out.println(str+" is Not Palindrome String");	
	}
	}

	
}
