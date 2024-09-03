package programmingChallenge15_20;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				Scanner input = new Scanner(System.in)) {
					System.out.println("Enter the number1: ");
					int num1 = input.nextInt();
					//System.out.println("Enter the number2: ");
					//int num2 = input.nextInt();
					//System.out.println("Enter the number3: ");
					//int num3 = input.nextInt();//
					if((int) num1 % 400 == 0 || (num1%4 == 0 && num1 % 100 != 0)) {
						System.out.println("The Year is leap year");
					}else {
						System.out.println("The Year is not a leap year");
					}
		}
	}

}
