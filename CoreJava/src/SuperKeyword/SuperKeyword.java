package SuperKeyword;

class A
{
   int a=10;
   void seen() 
   {
   System.out.println(a);
   }
}
class B extends A
{
	int a=20;
	void show(int a) 
	{
		super.seen();
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		B b=new B();
		b.show(30);
	}
}
