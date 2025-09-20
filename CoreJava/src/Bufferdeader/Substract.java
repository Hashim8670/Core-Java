package Bufferdeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Substract {

	public static void main(String[] args)throws IOException {
	BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
	 
	System.out.println("Enter 1st Number");
	
	float a =Float.parseFloat(br.readLine()); 
	
	System.out.println("Enter 2nd Number");
	
	int b =Integer.parseInt(br.readLine());
	
	System.out.println("Substarct 1st And 2nd No. = "+(a-b));
	}

}
