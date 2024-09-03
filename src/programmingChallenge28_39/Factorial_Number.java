package programmingChallenge28_39;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = readNumber();
		int fact = factorialNumber(num1);
		System.out.println("Factorial of " + num1 + " is : " + fact);
	}
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number : ");
		int num1 = input.nextInt();
		return num1;
		
	}
	public static int factorialNumber(int num1) {
		int fact  = 1;
		while(num1 > 0) {
			fact  *= num1;
			System.out.println(fact);
			num1--;
		}
		int factorial = fact;
		return factorial;
	}

}
