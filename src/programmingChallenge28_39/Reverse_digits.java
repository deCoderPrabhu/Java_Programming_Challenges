package programmingChallenge28_39;

import java.util.Scanner;

public class Reverse_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = readNumber();
		int rDigit = Dig_reverser(num1);
		System.out.println("the reversed number is : " + rDigit);

	}
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1 = input.nextInt();
		return num1;
		
	}
	public static int Dig_reverser(int num1) {
		int revDig = 0;
		while(num1 > 0) {
			int digit  = num1 % 10;
			revDig = revDig * 10 + digit;
			num1 /= 10;
		}
		return revDig;
		
	}

}
