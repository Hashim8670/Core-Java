package LogicalProgram;

public class PrimeNo {

	public static void main(String[] args) {
	
		        int a=17;
		        boolean isPrime=true;
		        for(int i=1; i<=a; i++)
		        {
		            if(a%i==0) {
		            	isPrime=false;
		            	break;
		            }
		           
		        }
		        if(isPrime==false) {
		       System.out.println(a+" is prime no");
		    }
		        else {
		        	System.out.println(a+" Is Not Prime no");
		        	}
		        }
		}
