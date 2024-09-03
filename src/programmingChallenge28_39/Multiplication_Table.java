package programmingChallenge28_39;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number of multiplication Table : ");
		int totNum = input.nextInt();
		int num1 = readNumber();
		
		while(totNum > 0) {
			System.out.println();
			multiplication_Table(num1);
			totNum--;
			num1++;
		}
		
		

	}
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1 = input.nextInt();
		return num1;
		
	}
	public static void multiplication_Table(int num1) {
		int multiply = 0;
		int i = 1;
		while(i <= 10) {
			multiply = num1 * i;
			System.out.println(num1+ "*" + i + "=" + multiply);
			System.out.println();
			i++;
		}
	}

}
