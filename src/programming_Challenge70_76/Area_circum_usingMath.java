package programming_Challenge70_76;

import java.util.Scanner;

public class Area_circum_usingMath {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Area and Circumference class");
		System.out.println("Enter the radius; ");
		double r = input.nextInt();
		
		double area = Math.PI * Math.pow(r,2);
		double circum = 2 * Math.PI * r;
		
		System.out.println("The Area is: "+area+" and Circumference is: "+ circum);
	}

}
