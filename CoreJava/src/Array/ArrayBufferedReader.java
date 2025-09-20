package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class ArrayBufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("Input Array");
	
        int size = Integer.parseInt(br.readLine()); 
        int[] number = new int[size];
        for(int i = 0 ; i<size; i++) {
        	 number[i] =Integer.parseInt(br.readLine().trim());
        } 
        System.out.println("Output Array");
         
        for(int i = 0; i<size ; i++) {
        	System.out.println(number[i]); 
        }
	} 

}
