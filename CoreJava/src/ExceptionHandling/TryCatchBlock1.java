package ExceptionHandling;

public class TryCatchBlock1{

	
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.driver");
		}
		catch(Exception e) {
			System.out.println(e);
		}
			System.out.println("Hashim Ansari");
			
	}

}

