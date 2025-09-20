package Logical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BfReaderFactNo {

	public static void main(String[] args) throws  IOException{
		BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
		 
		System.out.println("Enter A Number");
         int a=Integer.parseInt(br.readLine());
         int fact=1;
         for(int i=1; i<=a; i++) {
        	 fact=fact*i;
            System.out.print(fact+",");
         }
         
	}
}