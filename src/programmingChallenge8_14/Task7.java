package programmingChallenge8_14;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
						// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in)) {
					//System.out.println("Enter the number C degs: ");
					//double p = input.nextDouble();
					System.out.println("Enter the number F degs: ");
					double f = input.nextDouble();
					//System.out.println("Enter the number t: ");
					//double t = input.nextDouble();
					double  c = (f-32)* 5.0d / 9.0d;
					System.out.println("Print the value of c: " + c);
				}
	}

}
