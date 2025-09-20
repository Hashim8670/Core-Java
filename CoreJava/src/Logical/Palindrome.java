package Logical;


public class Palindrome {
    public static void main(String[] args) {
      

        long num = 121l;
        long num1=num;
        long reverse = 0;

        while (num > 0) {
            long digit = num % 10;
            reverse = reverse*10 +digit ;
            num = num / 10;
        }

        if (reverse == num1) {
            System.out.println(reverse + " is a Palindrome Number");
        } else {
            System.out.println(reverse + " is NOT a Palindrome Number");
        }
    }
}
