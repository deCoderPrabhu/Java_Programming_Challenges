package programmingChallenge8_14;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in)) {
					System.out.println("Enter the number p: ");
					double p = input.nextDouble();
					System.out.println("Enter the number r: ");
					double r = input.nextDouble();
					System.out.println("Enter the number t: ");
					double t = input.nextDouble();
					
					double x1 = (p*r*t)/100;
					System.out.println("Print the value of x1: " + x1);
					
				}

	}

}
