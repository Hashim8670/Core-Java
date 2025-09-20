package ThisKeyword;

public class FirstUse {

      float i=23;
	void setValue(float i) 
	{
		this.i =i;
	} 
	void show() 
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		FirstUse f=new FirstUse();
		
		f.setValue(10);
		f.show();
	}

}
