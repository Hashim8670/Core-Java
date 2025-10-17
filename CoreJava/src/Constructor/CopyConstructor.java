package Constructor;

public class CopyConstructor {
	 
	String name;
	String address;
	
	CopyConstructor(String name,String address){
		this.name=name;
		this.address=address;
	
	}
	CopyConstructor(CopyConstructor c){
		this.name=c.name; 
		this.address=c.address;
	}
	void show() {
		System.out.println("Name = "+name+" \n" + "Adress = " + address);
	}

	public static void main(String[] args) {
    
		CopyConstructor c= new CopyConstructor("Hashim","Koilsa");
		CopyConstructor v= new CopyConstructor(c);
		System.out.println("Original value ----> ");
          c.show();
          System.out.println("Local Value -----> ");
          v.show();

	}

}
