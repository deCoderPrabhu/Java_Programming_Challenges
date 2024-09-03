package programmingChallenge28_39;

import java.util.Scanner;

public class PrimeNumberDetectr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = readNumber();
		Find_prime(num1);

	}
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1 = input.nextInt();
		return num1;
		
	}
	public static void Find_prime(int num1) {
		int i =2;
		while(i <= num1) {
			int checkprime = num1%i;
			if(checkprime != 0) {
				System.out.println("The number is prime");
				break;
			}
			i++;			
		}
	}

}

