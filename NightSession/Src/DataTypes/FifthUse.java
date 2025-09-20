package DataTypes;

class Dog
{
  Dog(Tommy t)
  {
	System.out.println("What is This");  
  }	
}
class Tommy
{
	void show() 
	{
	@SuppressWarnings("unused")
	Dog d=new Dog(this);
	}
}
public class FifthUse {

	public static void main(String[] args) {
		Tommy t=new Tommy();
		t.show();
	}
}
