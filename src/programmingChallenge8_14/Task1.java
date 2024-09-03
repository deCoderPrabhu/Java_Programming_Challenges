package programmingChallenge8_14;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		var inputName = new Scanner(System.in)) {
			System.out.println("Enter the number A: ");
			int A = inputName.nextInt();
			System.out.println("Enter the number B: ");
			int B = inputName.nextInt();
			
			int x1 ;

			x1 = A + B;
			System.out.println("Addition karke dikhao " + x1);
			
			x1 = A - B;
			System.out.println("Subtraction karke dikhao " + x1);
			
			x1 = A/B;
			System.out.println("Division karke dikhao " + x1);
			
			x1 = A*B;
			System.out.println("Multiplication karke dikhao " + x1);
			
			x1 = A%B;
			System.out.println("Remainder to bataya nahi " + x1);
		}
		
		
		
		

	}

}
