package Logical;

class Test{
	int sum(int...a){
	 int total=0;
	 for(int i:a) {
		 total +=i  ;                                
	 }
		return total;
	 }
}	
public class VarargExample {
   public static void main(String[] args) {

      Test test = new Test();
      int t=test.sum(2,5,6,4,3,2,4,5);
      int b=test.sum(2,3,4,6,67,7,8,99,7,56);
      System.out.println(t+"\n"+b+"\n"+(t+b));
      
}
}
