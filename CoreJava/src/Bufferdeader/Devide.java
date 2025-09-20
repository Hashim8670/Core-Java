package Bufferdeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Devide {

	public static void main(String[] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
	 
	 System.out.println("Enter 1st Number");
	 
	 long a =Long.parseLong(br.readLine());
	 
	 System.out.println("Enter 2nd Number");
	 
	 long b =Long.parseLong(br.readLine());
	 
	 System.out.println("Multiply 1st And 2nd Number = "+(a/b));
	
	}

}

