package Day1;

import java.util.Scanner;

public class Printevenorodd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Digits");
		double num1 = scanner.nextInt();
		
		if (num1 %2 == 0) {
			System.out.println("This number is even");
		} else {
			System.out.println("This number is Odd & Remainder :" + num1%2);
		}
		
		scanner.close();

	}

}
