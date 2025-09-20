package Bufferdeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerDemo 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter A Number");
		  int a = Integer.parseInt(br.readLine());
		  int b= a;
		  int res = 0;
		   while(a>0)
		  {
			   int c = a % 10;
			   res = res*10+c;
			   a = a/10;
		  }
		  if(b == res)
		  {
			 System.out.println(b+" : Is Palindrome Number"); 
		  }
		  else
			  System.out.println(b+" : Is Not A Palindrome Number");
	}
}
