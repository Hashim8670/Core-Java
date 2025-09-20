package Logical;

public class PalindromeNuumber {

	public static void main(String[] args) {
		int a=123;
		int b=a;
		int res=0;
		
		while(a>0) {
			int rem=a%10; // rem=1,2,1
			res=res*10+rem; // res=1,12,121
			a/=10;  // a=12,1,0 
		}
		if(res==a) {
		System.out.println(res+" Is a Palindrome number");
		}
		else {
			System.out.println(res+" Is Not a Palindrome number");
		}
	}

}
