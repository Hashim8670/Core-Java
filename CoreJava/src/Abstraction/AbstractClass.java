package Abstraction;

abstract class Hashim
{
	Hashim(){
		System.out.println("What is your Name");
	}
       abstract void detail();	

     void show() 
    {
      System.out.println("Show Your Card");
    }
}
class Ansari extends Hashim
{
	Ansari()
	{
		System.out.println("How Are You");
	} 
	void detail()
	{
		super.show();
		System.out.println("Where Are You From");
	}
	
}
public class AbstractClass {
      public static void main(String[] args) {
		  Ansari a = new Ansari();
		  a.detail();
		
	}

	
}
