package String;

public class PalingromeString {

	public static void main(String[] args) {
		
		String s="sossos";
		String res="";
		
		for(int i=s.length()-1; i>=0; i--) {
			res=res+s.charAt(i);
		}
		if(res.equals(s)) {
			System.out.println(res+" String is a Palindrome");
		}
		else {
			System.out.println(res+" String is a not Palindrome");
		}	

	}

}
