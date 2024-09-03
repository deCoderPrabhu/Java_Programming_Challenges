package programmingChallenge53_58;

import java.util.Scanner;

public class simple_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Month Finder code solution");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num-1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num-2 : ");
		int num2 = sc.nextInt();
		double result  = op_Calc(num1,num2);
		System.out.println("The resultant Answer is : " + result);
	}
	public static double op_Calc(int num1, int num2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Operation : ");
		String Op  = sc.next();
		double result  = switch(Op){
			case "+" -> num1 + num2; 
			case "-" -> num1 - num2;
			case "/" -> (double) (num1 / num2);
			case "*" -> num1 * num2;
			default -> -1;
		};
		return result;
	}

}
