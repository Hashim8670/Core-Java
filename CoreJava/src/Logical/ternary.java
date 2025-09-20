package Logical;

public class ternary {

	public static void main(String[] args) {
		int a= 1;
		int b = 2;
		int i = 0;
		while(i!=3) {
			a = (a++ >b ?++a : b++)+i;  // A = 2, 6, 
			b = (b++ <a ?a++ : ++b)-i;  // B = 5, , 
			i++;
			System.out.println(a);
			System.out.println(b);
		}
//		System.out.println(a);
//        System.out.println(b);
	}

}
