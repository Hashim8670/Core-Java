package Polymorphism;

class  Owner{
	String name;
	int salary;
	
	public Owner() {
	
	}
	public Owner(String string, int i){
			name=string;
			salary=i;
	}
	
	void tell () 
	  {
		  System.out.println(name+"\n"+salary); 
		  
	  }
	 
}
class Clerk extends Owner {
	Owner e;
	public Clerk(Owner e) {
		this.e  =  e;
	}
	void  tell() {
	  System.out.println("Tell  Me  Your Salary");
	}
}

public class OverridingByField {
      public static void main(String[] args) {
    	 Owner o = new Owner("Hashim Ansari",10000);
    	
    	  Owner or = new Clerk(o);
    	  or.tell();
	}
}
