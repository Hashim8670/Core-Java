package CollectionFramwork;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<>();
		
       ts.add("Hashim");
       ts.add("Ansari");
       ts.add("Koilsa");
       ts.add("S K Nagar");
       ts.add("Uttar Pradesh");
       System.out.println(ts);
       
       ts.remove("Ansari");
       System.out.println(ts);
       
       TreeSet<Integer> ts1=new TreeSet<>();
       ts1.add(80);
       ts1.add(50);
       ts1.add(40);
       ts1.add(60);
       ts1.add(30);
       ts1.add(70);
       System.out.println(ts1);
       ts1.remove(40);
       System.out.println(ts1);
	} 

}
