package Abstraction;

abstract class College{
	
	abstract void watch();

	void play () {
		System.out.println("Come to play VolleyBall");	
	}
	abstract void run();
}
class Student extends College{
	
	void watch() {
		System.out.println("Student Watch The College");
	}
	void run() {
		System.out.println("Student Run the College Side ");
	}
	
}
public class Interface {

	public static void main(String[] args) {
	   Student s = new Student();
	   s.watch();
	   s.run();
	}

}
