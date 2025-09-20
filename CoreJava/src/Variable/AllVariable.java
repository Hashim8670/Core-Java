package Variable;

class VariableDemo
{
   int a = 10;          // Instance Variable
   
   static int b = 15;   // Static Variable
   
    VariableDemo()      
    {
	 System.out.println("This is Constructor");   //Constructor
      } 
   static
   {
	   System.out.println("This is Static Block");  // Static block  class loding ke time call  hota hai
   } 
   
   {
	 System.out.println("This is Initializer Block"); //Initializer Block  
   }                                              // 
   void add()                  // Method
   {
     int c= 10;                 // Local Variable
     System.out.println(a+b+c);   
   }
   void sum() 
   {                             // C  nahi le sakte q ki c local variable hai                      
	System.out.println(a+b);   //  q ki local  variable jis method main declaire hota hai 
   }                            //  usi main access rahta hai
   static 
   {
	  System.out.println("This is Static method "+b); // C and a nahi le sakte q ki c and a local  
   }                                                        // aur Instance variable hai
                                                      // instance variable static ke andar nahi access hai
}
 class AllVariable {

	public static void main(String[] args) {
	 
		VariableDemo v = new VariableDemo();
		v.add();
		
		
	}
}
