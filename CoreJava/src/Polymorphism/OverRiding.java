package Polymorphism;
 
class One { 
	public void math1() {
		System.out.println("Math of one");
	}
}
class Two extends One{
	@Override
	public void  math1() {
		super.math1();
		System.out.println("Math of two");
	}
}
public class OverRiding {
   public static void main(String[] args) {
	One o = new Two();
	o.math1();
}
}
