package DataTypes;

import java.util.Scanner;

public class AreaOfCircleUsingScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Radius");
		double radius=sc.nextDouble();
		
		double area=Math.PI*radius*radius;
		
		System.out.println("Radius "+radius);
		System.out.println("Circle Area "+area);
		sc.close();
	}

}
