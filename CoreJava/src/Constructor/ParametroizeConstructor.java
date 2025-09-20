package Constructor;
  
class Person {
	String name ;
	String address;
	Person(String n ,String a){
		name = n;
		address = a;
	}
	void show() {
	   System.out.println("Name : "+name+"\n"+"Address : "+address);	
	}
}
public class ParametroizeConstructor {
public static void main(String[] args) {
	  Person p  = new Person("Hashim Ansari","Koilsa");
	  p.show();
}
}
