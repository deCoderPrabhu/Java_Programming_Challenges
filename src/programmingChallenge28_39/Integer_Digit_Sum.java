package programmingChallenge28_39;

import java.util.Scanner;

public class Integer_Digit_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = readNumber();
		int Int_digsum = Digit_Sum(num1);
		System.out.println("The sum of digits of the Integer is :" + Int_digsum);
		}
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number : ");
		int num1 = input.nextInt();
		return num1;
		
	}
	public static int Digit_Sum(int num1) {
		int count = 0;
		int sum = 0;
		while(num1 > 0) {
			int dig = num1 % 10;
			sum = sum + dig;
			num1 /= 10;	
		}
		return sum;
		
	}

}
