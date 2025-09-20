package CoreJava;

public class Instance {
	static int a = 30;    // static Variable
	int b = 20;      //instance Variable 
	   void plus()
	{
		   int c = 40;
	 System.out.println(a);
	 System.out.println(b+b-c);
	}
	 void add() {
		  a = 50;
		  b = 30;
		 {
		 System.out.println(a+b);
		 }
	 }
		 void sum(){
			a =80;
			b = 40;
			System.out.println(a+b);
		 }
	 
    public static void main(String[] args) {
		Instance i = new Instance();
		i.add();
		i.sum();
		i.plus();
	}
}
