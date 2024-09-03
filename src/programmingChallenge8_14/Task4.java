package programmingChallenge8_14;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in)) {
					System.out.println("Enter the number B: ");
					int B = input.nextInt();
					System.out.println("Enter the number H: ");
					int H = input.nextInt();
					
					double x1 = 0.5 * B * H;
					System.out.println("Print the value of x1: " + x1);
					
				}

	}

}
