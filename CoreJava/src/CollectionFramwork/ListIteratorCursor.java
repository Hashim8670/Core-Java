package CollectionFramwork;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorCursor {

	public static void main(String[] args) {
		
		ArrayList<String> l =new ArrayList<>();
		
		l.add("Hashim");
		l.add("Ansari");
		l.add("Koilsa");
		l.add("S k Nagar");
//		System.out.println(l);
//		System.out.println(l.remove("Ansari"));
//		System.out.println(l);
		ListIterator<String> lt=l.listIterator(l.size());
//		while (lt.hasNext()) {
//			System.out.println(lt.next());
//		}
		System.out.println("<------------------------------------->");
		while (lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
		System.out.println("___________________________________");
		l.forEach(e->{
			System.out.println(e);
		});
		
	}

}
