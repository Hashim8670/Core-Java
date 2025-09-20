package SuperKeyword;

class Animal
{
	void eat()
	{
	   System.out.println("Dog Eat Bones");	
	}
}
class Cat  extends Animal
{
    void eat()
    {
    	System.out.println("Cat Drink Milk");
    }
    void show()
    {
    	super.eat();
    	eat();
    	System.out.println("Success Fully Completed");
    }
}
public class UseSuper_Keyword {

	public static void main(String[] args) {
	   Cat c=new Cat();
	   c.show();
	}
}
