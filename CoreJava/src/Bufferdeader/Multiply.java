package Bufferdeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiply {

	public static void main(String[] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
	 
	 System.out.println("Enter 1st Number");
	 
	 float a =Float.parseFloat(br.readLine());
	 
	 System.out.println("Enter 2nd Number");
	 
	 double b =Double.parseDouble(br.readLine());
	 
	 System.out.println("Multiply 1st And 2nd Number = "+(a*b));
	
	}

}
