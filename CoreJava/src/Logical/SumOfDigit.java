
package Logical;


class SumOfDigit{
    public static void main(String args[]){
    long a= 91l;
    long b=a;
   long sum = 0;
    while(b>0){
    	sum += b%10;
    	b= b/10;
    }
    System.out.println(sum);
    }
}

