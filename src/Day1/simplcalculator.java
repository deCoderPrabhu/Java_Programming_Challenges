package Day1;

import java.util.Scanner;

public class simplcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the First number");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter the Second number");
		double num2 = scanner.nextDouble();
		
		System.out.println("Enter the operation +,/,-,*");
		char op = scanner.next().charAt(0);
		
		double result;
		
		switch (op) {
		
		case '+' :
			result = num1 + num2;
			System.out.println("Result :" + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("Result :" + result);
			break;
		case '/':
			if(num2 != 0) {
				result = num1 / num2;
				System.out.println("Result :" + result);
				
			}else {
				System.out.println("ERROR");
			}
			break;
		case '*':
			result = num1 * num2;
			System.out.println("Result :" + result);
			break;
		default:
			System.out.println("Invalid Operation. Please TRY AGAIN");
			

	}
		scanner.close();
	}

}
