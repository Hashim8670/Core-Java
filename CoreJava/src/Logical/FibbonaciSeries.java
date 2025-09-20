package Logical;

public class FibbonaciSeries {

	public static void main(String[] args) {
	 
	    int no1=0 , no2=1;
	    System.out.println("Your Fibbonaci Series");
	    System.out.print(no1+","+no2);
	    
	    for(int i=1;i<=10;i++) 
	    {
	    int sum=no1+no2;
	    System.out.print(","+sum);
	    
	    no1 = no2;
	    no2 = sum;
	    }
	}
}
