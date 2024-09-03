package programmingChallenge59_69;

import java.util.Scanner;

public class Prime_numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = input.nextInt();
		int  i = 2;
		if(!prime(num,i)) {
			System.out.println("The number is prime");
		}

	}
	static boolean prime(int num, int i) {
		if(i==100) {
			return false;
		}else {
			if(num==i) {
				return false;
			}else if(num % i==0) {
				System.out.println("The number is not prime");
				return true;
			}
			prime(num, i+1);
		}
		return false;
	}

}
