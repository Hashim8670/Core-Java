package SuperKeyword;

class Bank
{
    Bank()
    {
       System.out.println("I Am Manager");	
    }	
}
class Employee extends  Bank
{
	String name;
	Employee(String name)
	{	
		this.name=name;
	System.out.println("What is Your Name");
	}
	void seen() 
	{
		System.out.println("My Name  Is : "+name);
	}
}
public class Super_Keyword {

	public static void main(String[] args) {
		Employee e=new Employee("Hashim Ansari ");
         e.seen();
	}
}
