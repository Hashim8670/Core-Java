package Logical;

public class StringBreak {

	public static void main(String[] args) {
		String str="Sakinaka mumbai";

        // "a" ke hisaab se todna
        String[] parts = str.split("a");

        for (String s : parts) {
            System.out.println(s);
}
        System.out.println("byy");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a') {
                // "a" hamesha alag line me
                System.out.println("a");
            } else {
                // check karo agar next char 'a' hai
                if (i + 1 < str.length() && str.charAt(i + 1) == 'a') {
                    System.out.println(ch);  // pehle wala character
                } else {
                    System.out.print(ch);    // same line me print hoga
                }
            }
        }
    }
}
