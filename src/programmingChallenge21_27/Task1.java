package programmingChallenge21_27;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a : ");
		int a = input.nextInt();
		System.out.println("Enter b : ");
		int b = input.nextInt();
		
		int c = a & b;
		System.out.println("value c : " + c);

	}

}
