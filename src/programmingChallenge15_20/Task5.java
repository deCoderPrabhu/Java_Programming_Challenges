package programmingChallenge15_20;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				Scanner input = new Scanner(System.in)) {
					System.out.println("Enter the Total Marks : ");
					int totMarks = input.nextInt();
					//System.out.println("Enter the number2: ");
					//int num2 = input.nextInt();
					//System.out.println("Enter the number3: ");
					//int num3 = input.nextInt();//
					double grade = ((double) totMarks/500)*100;
					if(grade>=90) {
						System.out.println("Grade : "+ grade + "\nYou got A Grade");
					}else if(grade>=75) {
						System.out.println("Grade is: "+ grade + "\nYou got B Grade");
					}else if(grade>=60) {
						System.out.println("Grade is: "+ grade + "\nYou got C Grade");
					}else if(grade>=30) {
						System.out.println("Grade is: "+ grade + "\nYou got D Grade");
					}else {
						System.out.println("Grade is: "+ grade + "\nYou are not Selected");
					}
		}

	}

}
