package Polymorphism;

class Person{
	
	void show(String  name) {
		System.out.println(name);
	}
	void  show (int id) {
		System.out.println(id );
	}
	void show (String name ,int id) {
		System.out.println(name+":"+id);
	}
}
public class Overloading1 {

	public static void main(String[] args) {
	 Person p = new Person();
		p.show("Hashim Ansari");
		p.show(12);
		p.show("Hashim Ansari",12);
	}
}
