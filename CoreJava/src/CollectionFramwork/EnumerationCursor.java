package CollectionFramwork;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {
	 
     Vector<Object> vector = new Vector<>();
     
     vector.add("Hashim");
     vector.add("Ansari");
     vector.add("Koilsa");
     
     Enumeration<Object> e=vector.elements();
     while(e.hasMoreElements()) {
    	 System.out.println(e.nextElement());
     }
	}

}
