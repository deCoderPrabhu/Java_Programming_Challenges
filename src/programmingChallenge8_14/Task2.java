package programmingChallenge8_14;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in)) {
					System.out.println("Enter the number A: ");
					float A = input.nextFloat();
					System.out.println("Enter the number B: ");
					float B = input.nextFloat();
					System.out.println("Enter the number c: ");
					float c = input.nextFloat();
					System.out.println("Enter the number d: ");
					float d = input.nextFloat();
					
					double x1 = A + B + c + d;
					double x2 = (int) x1 ;
					System.out.println("Print the value of x1: " + x2);
					
				}

	}

}
