package ExceptionHandling;

import java.io.FileInputStream;

public class TryCatchBlock {  
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {			
		
			FileInputStream fl=new FileInputStream("Program.java");
		}
		catch(Exception e) {
			System.out.println(e);
		}
			System.out.println("Hashim Ansari");
	}

}
