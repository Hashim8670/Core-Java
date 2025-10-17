package CollectionFramwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	@SuppressWarnings("boxing")
	public static void main(String[] args) {
	
		Set<Integer> s=new HashSet<>();
		s.add(400);
		s.add(200);
		s.add(400);
		s.add(200);
		s.add(null);
		s.add(null);
	    System.out.println(s.remove(null));
	    System.out.println(s.add(786));
        System.out.println(s);
        Iterator<Integer> itr=s.iterator();
        
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
       
	}

}
