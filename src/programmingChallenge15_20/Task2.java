package programmingChallenge15_20;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				Scanner input = new Scanner(System.in)) {
					System.out.println("Enter the number: ");
					int num = input.nextInt();
					if(num%2==0) System.out.println("The number is Even");
					else System.out.println("The number is Odd");
		}

	}

}
