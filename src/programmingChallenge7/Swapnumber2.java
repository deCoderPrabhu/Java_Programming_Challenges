package programmingChallenge7;

import java.util.Scanner;

public class Swapnumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number A: ");
		int A = input.nextInt();
		System.out.println("Enter the number B: ");
		int B = input.nextInt();
		
		A = (A * B)/A;
		B = (A * B)/B;
		
		System.out.println("A Ki value Batao: " + A);
		System.out.println("B Ki value Batao: " + B);

	}

}
