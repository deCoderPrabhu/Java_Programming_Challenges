package programmingChallenge53_58;

import java.util.Scanner;

public class Absolute_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the minimum number code solution");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num-1 : ");
		long num1 = sc.nextLong();
		long result = num1 >= 0 ? num1 : -num1;
		System.out.println("The resultant Number is : " + result);
	}

}
