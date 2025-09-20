package Variable;

class Instance
{
    int a=20 ;
    int b = 5;
    void sum()
    {                         // instance variable method ke bahar hota hai 
     System.out.println(a+b); // har method main Access hota hai 
    }                         // without static method ke
    void add()
    {
     System.out.println(a+b);	
    }
}

public class InstanceVariable {

	public static void main(String[] args) {
	  Instance i = new Instance();
	   i.sum();
	   i.add();

	}

}
