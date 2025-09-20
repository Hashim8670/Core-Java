package Inharitance;

class Employee{
	float salary;
	void show(float salary) {
	System.out.println("Salary : "+salary);
	}
}
class Programmer extends Employee{
	  int bonus;
	  void display(int bonus) {
		  System.out.println("Bonus  : "+bonus);
	  }
}
public class Inharitance {

	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.show(10000);
		p.display(20000);
	}

}
