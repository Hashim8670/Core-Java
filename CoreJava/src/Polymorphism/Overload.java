package Polymorphism;
 
class Overload {
        String sum(String name  ,String id) {
        	 return name + id;
         }
         String sum(String name, String id, String no) {
        	 return name+id+no;
         }
        public static void main(String[] args) {
			Overload o = new Overload();
         System.out.println(o.sum("Hashim ","24"));
         System.out.println(o.sum("Hashim ","34"," 723386"));
        }
}
 