package programmingChallenge15_20;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				Scanner input = new Scanner(System.in)) {
					System.out.println("Enter the number1: ");
					int num1 = input.nextInt();
					System.out.println("Enter the number2: ");
					int num2 = input.nextInt();
					System.out.println("Enter the number3: ");
					int num3 = input.nextInt();
					if(num1>num2 && num1>num3) {
						System.out.println("The Greatest Number is:" + num1);
					}else if(num2>num1 && num2>num3) { 
						System.out.println("The Greatest Number is:" + num2);
					}else {
						System.out.println("The Greatest Number is:" + num3);
					}
		}

	}

}
