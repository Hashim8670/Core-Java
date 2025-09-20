package Variable;

class Local
{
	void add() {
   int a = 10;
   int b = 20; 
   System.out.println(a+b);
}
//	void sum()                 //Local Variable Within The Method hota hai jis main declaire hota    
//	{                          // hai usi main access rahta hai
//	  System.out.println(a+b); //Isme  error provide karta hai
//	}
}
public class LocalVariable {

	public static void main(String[] args) {
	 Local l = new Local();
	 l.add();

	}

}
