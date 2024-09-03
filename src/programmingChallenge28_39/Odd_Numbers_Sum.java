package programmingChallenge28_39;

import java.util.Scanner;

public class Odd_Numbers_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = readNumber();
		int sum = 0;
		while(num1 >= 0) {
			if(num1%2 != 0) {
				sum += num1;		
			}
			num1--;
		}
		System.out.println("The sum of odd numbers are : " + sum);

	}
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number : ");
		int num1 = input.nextInt();
		return num1;
		
	}

}
