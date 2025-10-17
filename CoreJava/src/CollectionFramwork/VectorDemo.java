package CollectionFramwork;

import java.util.Vector;

public class VectorDemo {
   @SuppressWarnings({ "rawtypes", "boxing" })
public static void main(String[] args) {
	
	   Vector<Comparable> v=new Vector<>();
	   
	   v.addElement(19);
	   v.addElement(12);
	   v.addElement(14);
	   v.addElement(28);
	   
	   System.out.println(v); 
	   v.setElementAt("Hashim Ansari",0);
	   System.out.println(v);
	  System.out.println(v.capacity());
}
}
