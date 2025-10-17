package CollectionFramwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
   public static void main(String[] args) {
	 
	HashMap<Integer,String> hm=new HashMap<>();
	
	 hm.put(12,"Mohammad");
	 hm.put(13,"Hashim");
	 hm.put(14,"Ansari");
	 hm.put(15,"Koilsa");
	 
//	 hm.replace(12, "Qasim");
	 System.out.println(hm.size());
//   hm.clear();
//   hm.remove(12);
//   System.out.println(hm.containsKey(14));
//   System.out.println(hm.containsValue("Mohammad"));
//   System.out.println(hm.get(15)); 
//   for(Map.Entry me : hm.entrySet()) {
//	   System.out.print(me.getKey()+" <------> "+me.getValue()+",");
//   }
//	 Set set=hm.entrySet();
//	 System.out.println(set);
//	 
//	 Iterator itr=set.iterator();
//	 while(itr.hasNext()) {
//		 System.out.println(itr.next()+",");
//		 Map.Entry e=(Map.Entry)itr.next();
//		 System.out.print(e.getKey()+" ----> "+e.getValue()+" , ");
	 }
}
