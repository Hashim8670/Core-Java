package Variable;
public class Variable  
{
    int a = 10 ;
    static int b = 15;
    void sum()
    {
    int c =20;
    System.out.println(a+b+c);              
    }                                                                                                   
    void add()                                         
    {
      System.out.println(a+b);  // yahan par sop main ham d nahi le  sakte q ki d  local variable hai                
    }                                     // local variable within the method hota hai 
                                     //  jis main declair hota hai usi main rahta hai
    public static void main(String[] args) {
    	System.out.println(b);                  // Yahan par instance aur local variable 	                                                      
    	Variable v = new Variable();        //dono nahi le  sakte hai q ki static method hai 
		  v.sum();
		  v.add();
	}
   }  

