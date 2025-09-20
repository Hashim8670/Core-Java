package CoreJava;
 
class Garden{
	void details() {
		System.out.println("4  Beegha");
	}
}
class Placee
{
	Garden g;
	Placee() {
		g = new Garden();
	 System.out.println("Koilsa");
	}
     void price() {
    	 g.details();
    	 System.out.println("10 CR");
     }
}
public class Main {
	public static void main(String[] args) {
	
      Placee p = new Placee();
      p.price();
	}
}
