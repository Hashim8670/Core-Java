package Bufferdeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	  System.out.println("Enter a int Number : ");
	
	  int a = Integer.parseInt(br.readLine());
		System.out.println("Enter A Byte Number");
		
	   byte b = Byte.parseByte(br.readLine());
		
		System.out.println("Enter A Short Number");
		
		short s  = Short.parseShort(br.readLine());
	
		System.out.println("A + B + C ="+(a+b+s));
	}
}
