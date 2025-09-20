package Covarient;

class A {
   Object print() {
	   System.out.println("Give me My Pen");
	   return this;
   }
}
class B extends A{
	@SuppressWarnings("boxing")
	Integer print() {
		System.out.println("12312");
		return (2);
	}
}
public class CovarientDemo {
     public static void main(String[] args) {
        A a = new B();
         a.print();
         B b = new B();
         b.print();
	}
}
