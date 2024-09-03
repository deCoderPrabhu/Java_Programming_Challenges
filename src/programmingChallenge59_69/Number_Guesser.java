package programmingChallenge59_69;

import java.util.Scanner;

public class Number_Guesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the number of attempts");
		int atmpts = input.nextInt();
		iscorrectnum(atmpts);
	}
	
	static void iscorrectnum(int atmpts) {
		if(atmpts == 0) {
			System.out.println("BAD LUCK....:(");
		}else {
		Scanner input1  = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input1.nextInt() ;
		if(num == 19) {
			System.out.println("You are a Guessing maestro!!!!!!");
		}else {
		iscorrectnum(atmpts-1);
		}
	}
	}

}
