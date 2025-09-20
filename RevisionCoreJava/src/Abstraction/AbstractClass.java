package Abstraction;

abstract class Vegitable{
	abstract void price();
	abstract void eat();
	void run() {
		System.out.println("I Am running");
	}
} 
class Main extends Vegitable{
	 
	public void price() {
		System.out.println("Only Rs 20,");
	}
	public void eat() {
		System.out.println("I am eating Ladyfinger");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Main main = new Main();
		main.price();
        main.eat();
        main.run();
	}
}
