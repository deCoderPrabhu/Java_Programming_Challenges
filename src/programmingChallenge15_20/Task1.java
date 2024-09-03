package programmingChallenge15_20;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
		Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the number: ");
			int num = input.nextInt();
			if(num>0) System.out.println("The number is Positive");
			else System.out.println("The number is Negative");
		}

	}

}
