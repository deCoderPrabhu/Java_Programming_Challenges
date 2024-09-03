package programmingChallenge53_58;

import java.util.Scanner;

public class Minimum_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the minimum number code solution");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num-1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num-2 : ");
		int num2 = sc.nextInt();
		Minimum_Num ternary = new Minimum_Num();	
		int min_Num = ternary.min(num1,num2);
		System.out.println("The minimum number is : " + min_Num);
	}
	private int min(int num1, int num2) {
		return num1 < num2?num1 : num2;
	}

}
