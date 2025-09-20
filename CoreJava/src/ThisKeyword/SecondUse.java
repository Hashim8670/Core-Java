package ThisKeyword;

class SecondUse{

  void show() 
    {
	  System.out.println("Hello Developer");
	}
  void display() 
  {
	  this.show();
	  System.out.println("How Are you");
  }
  
	public static void main(String[] args) {
	
		SecondUse s=new SecondUse();
		s.display();
	}
 
}
