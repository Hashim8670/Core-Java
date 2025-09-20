package ThisKeyword;

public class ThirdUse {

	ThirdUse()
	{
		System.out.println("Hello Developer");
	}
	ThirdUse(int a)
	{
		this();
		System.out.println("How Are You");
	}
    void  show() 
    {
    	System.out.println("I am Fine");
    }
	public static void main(String[] args) {
		ThirdUse t=new ThirdUse(12);
		t.show();
	}
	
}
