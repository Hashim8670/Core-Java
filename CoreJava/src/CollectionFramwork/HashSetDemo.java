package CollectionFramwork;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();

       al.add("Qasim");
       al.add("ansari");
       al.add(278);
       al.add(2);
		
		HashSet hs=new HashSet();
		hs.addAll(al);
		hs.add("hashim");
		hs.add(12);
		hs.add(25);
		hs.add(20.9);
		
		System.out.println(hs);
		hs.clear();	
		System.out.println(hs);
   
	}

}
