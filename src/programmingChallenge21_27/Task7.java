package programmingChallenge21_27;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a : ");
		int a = input.nextInt();
		
		if((a & 1) == 0) {
			System.out.println("The number is even");
		}else{
			System.out.println("The number is odd");
		}
	}

}
