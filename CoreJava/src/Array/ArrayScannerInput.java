package Array;

import java.util.Scanner;

public class ArrayScannerInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Input Array");
		int size = sc.nextInt();
		int[] number = new int[size];
		for(int i = 0 ; i<size ;  i++) {
			number[i] = sc.nextInt();
		}
		System.out.println("Output Array");
	for(int i = 0; i<size ; i++) 
	{
		System.out.println(number[i]);
		sc.close();
	}
}
}
