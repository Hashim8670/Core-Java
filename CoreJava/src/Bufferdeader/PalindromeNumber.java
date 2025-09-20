package Bufferdeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber {
    public static void main(String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num =Integer.parseInt(br.readLine());
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;          
            reverse = reverse * 10 + digit; 
            num = num / 10;             
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is NOT a Palindrome Number.");
        }
    }
}
