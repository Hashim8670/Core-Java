package Logical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BfReadderPrimeNo {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A No");
		int a=Integer.parseInt(br.readLine());
        int count=0;
        
        for(int i=1; i<=a; i++) {
        	if(a%i==0) {
        		count++;
        	}
        }
        	if(count==2) {
        		System.out.println(a+" :Is Prime No");
        	}
        	else {
        		System.out.println(a+" : Is Not A Prime No");
        	}
        }
	}
