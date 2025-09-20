package GetUserInput;

import java.util.Scanner;

public class AllPrimitiveData {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter An int no: ");
		int i=sc.nextInt();
		
		System.out.println("Enter a Byte no: ");
		byte b=sc.nextByte();
		
		System.out.println("Enter a Short no: ");
		short s=sc.nextShort();
		
		System.out.println("Enter a Long no: ");
		long l=sc.nextLong();
		
		System.out.println("Enter a Char no: ");
		char c=sc.next().charAt(0);
		
		System.out.println("Enter a Float no: ");
		float f=sc.nextFloat();      
		
		System.out.println("Enter a Double no: ");
		double d=sc.nextDouble();
		
		System.out.println("Enter a Boolean no: ");
		boolean bl=sc.nextBoolean();
		
		System.out.println("This is All Primitive Data Types");
		System.out.println("");
		System.out.println("Int value : "+i);
		System.out.println("Byte value : "+b);
		System.out.println("Short value : "+s);
		System.out.println("Long value : "+l);
		System.out.println("Char value : "+c);
		System.out.println("float value : "+f);
		System.out.println("Double value : "+d);
		System.out.println("Boolean value : "+bl);
		        
		sc.close();
	}

}
