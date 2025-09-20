package DataTypes;

public class FourthUse {

	void show(FourthUse ft)
	{
		System.out.println("I Am Learner");
	}
	void display()
	{
		show(this);
	}
	
	public static void main(String[] args) {
		FourthUse f=new FourthUse();
		f.display();
	}

}
