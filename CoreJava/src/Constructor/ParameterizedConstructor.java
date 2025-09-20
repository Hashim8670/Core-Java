package Constructor;

public class ParameterizedConstructor {
	String name;
	int rollno;
	ParameterizedConstructor(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	void seen() {
	System.out.println("Name : "+name +"\n"+"Roll No : "+rollno);
	}
	public static void main(String[] args) {
		ParameterizedConstructor p= new ParameterizedConstructor("Hashim",12);
		p.seen();
		}
}
