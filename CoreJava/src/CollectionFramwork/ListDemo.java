package CollectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	  @SuppressWarnings("boxing")
	public static void main(String[] args) {
		  List<Integer> l=new ArrayList<>();
		  l.add(50); 
		  l.add(70); 
		  l.add(80); 
		  l.remove(2); 
		  
		  System.out.println(l);
		  List<Integer> l1=new ArrayList<>();
		  l1.add(null); 
		  l1.add(null);
		  l1.add(90); 
		  l1.add(100);
		  l1.remove(0);
		  
		  System.out.println(l1);
		  l.addAll(l1);
		  
		  System.out.println(l);  
		  Iterator<Integer> itr=l.iterator();
		
		  while(itr.hasNext()) {
		  System.out.println(itr.next());
           }	
		  System.out.println("This is List Iterator");
		  ListIterator<Integer> lt=l1.listIterator();
		  while(lt.hasNext()) {
			  System.out.println(lt.next());
	           }	 
		  System.out.println("<--------------------------->");
		  while(lt.hasPrevious()) {
		 
			  System.out.println(lt.previous());
		  }
	  }
}
