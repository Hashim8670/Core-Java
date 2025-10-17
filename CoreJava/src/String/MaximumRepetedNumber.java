package String;

public class MaximumRepetedNumber {
      public static void main(String[] args) {
		
    	  String s="Hashim";
    	  int[] a=new int[256];
    	  
    	  for(int i=0; i<s.length(); i++) {
    		  
    		  a[s.charAt(i)]=a[s.charAt(i)]+1;
    	  }
    	  int max=-1;
    	  char c=' ';
    	  
    	  for(int i=0; i<s.length(); i++) {
    		  if(max<a[s.charAt(i)]) {
    			  max=a[s.charAt(i)]; 
    			  c=s.charAt(i);
    		  }
    	  }
    	  System.out.println("Maximum Repeted Number Is "+c);
	   }
  }
