package CollectionFramwork;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
		
    	Stack <String> s=new Stack<>();
    	
    	s.add("Koilsa");
    	s.add("Ansari");
    	s.add("Hashim");
    	System.out.println(s);
      //s.pop();
      //System.out.println(s);
      System.out.println(s.pop());
      System.out.println(s.peek());
      s.push("Sant kabir nagar");
      System.out.println(s);
	}
}
