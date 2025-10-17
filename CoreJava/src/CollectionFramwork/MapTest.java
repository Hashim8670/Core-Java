package CollectionFramwork;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
     public static void main(String[] args) {
		
    	Map m=new HashMap();
    	
    	m.put(12, "Hashim");
    	m.put(13, "Qasim");
    	m.put(14, "Salim");
    	m.put(15, "Aasim");
    	m.put(16, "Tahir");
    	
    	//System.out.println(m.containsKey(12));
    	//System.out.println(m.containsValue("Qasim"));
//    	m.clear();
//    	System.out.println(m);
//      m.remove(14);
 //    	m.replace(13, "Ansari");
        System.out.println(m.size());
    	  
	}
}
