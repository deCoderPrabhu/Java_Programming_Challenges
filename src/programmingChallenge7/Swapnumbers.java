package programmingChallenge7;

import java.util.Scanner;

public class Swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number A: ");
		int A = input.nextInt();
		System.out.println("Enter the number B: ");
		int B = input.nextInt();
		
		int C = 0 ;
		C = A;
		A = B;
		B = C;
		System.out.println("A Ki value Batao: " + A);
		System.out.println("B Ki value Batao: " + B);	

	}

}
