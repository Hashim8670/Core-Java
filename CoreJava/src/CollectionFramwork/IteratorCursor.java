package CollectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {

	public static void main(String[] args) {
	  
		List<String> l=new ArrayList<>();
		
		l.add("Hashim");
		l.add("Ansari");
		l.add("Koilsa");
		l.add("Sant Kabir nagar");
		Iterator<String> itr=l.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		l.remove("Hashim");
		System.out.println(l);
		l.set(0,"Qasim");
		System.out.println(l);
	}

}
