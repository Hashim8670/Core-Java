package String;

public class StringMethod {
	public static void main(String[] args) {
		
		  int a=10;
		  String str = "hashim"; 
		  String str1 = "Hashim";
		  String str2 = " koilsa";
		  String s = new String("hashim");
		  String s1 = new String("hashim"); 
		  
		  System.out.println("1.-->  "+(str==str1));
		  System.out.println("2.-->  "+(str==s));
		  System.out.println("3.-->  "+s.equals(s1));
		  System.out.println("4.-->  "+str.equals(s1));
		  System.out.println("5.-->  "+str.length());
		  System.out.println("6.-->  "+str.toUpperCase());
		  System.out.println("7.-->  "+str.toLowerCase());
		  System.out.println("8.-->  "+str.contains("y"));
		  System.out.println("9.-->  "+str.indexOf("i"));
		  System.out.println("10-->  "+str.lastIndexOf("h"));
		  System.out.println("11-->  "+str.charAt(4));
		  System.out.println("12-->  "+str.startsWith("i"));
		  System.out.println("13-->  "+str.endsWith("a"));
		  System.out.println("14-->  "+str2.trim());
		  System.out.println("16-->  "+str.substring(1,3));
		  System.out.println("17-->  "+str.replace("h", "G"));
		  System.out.println("18-->  "+str.replaceFirst ("h", "Q"));
		  System.out.println("19-->  "+str.replaceAll("h(.)", "f")); 
		  System.out.println("20-->  "+str.replaceAll("h(.*)", "S"));
		  System.out.println("21-->  "+str.compareTo(str1));
		  System.out.println("22-->  "+str.compareToIgnoreCase(str2));
		  System.out.println("23-->  "+str.concat(str2));
		  System.out.println("24-->  "+String.join("/",str,str1,str2));
		  System.out.println("25-->  "+str2.subSequence(2,7));  
		  System.out.println("26-->  "+str2.substring(2,5));
		  System.out.println("27-->  "+str2.isEmpty()); 
		  System.out.println("28-->  "+str.equalsIgnoreCase(str2));
		  String s2=String.valueOf(a);
		  System.out.println("29-->  "+s2);
		  char[] b=str2.toCharArray();
		  System.out.println(b);
		   String[] m=str.split("h");
		   for(String n:m) {
			   System.out.println("29-->  "+n);
		   }
             	}
        }

