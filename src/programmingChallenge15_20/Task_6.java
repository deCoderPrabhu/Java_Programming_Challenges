package programmingChallenge15_20;

import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
			System.out.println("Enter the Age : ");
			int age = input.nextInt();

			if(age>=60) {
				System.out.println("You are in a SENIOR Category");
			}else if(age<=60 && age>=20) {
				System.out.println("You are in a ADULT Category");
			}else if(age>=13 && age<=20) {
				System.out.println("You are in a TEEN Category");
			}else {
				System.out.println("You are CHILD");
			}

	}

}
