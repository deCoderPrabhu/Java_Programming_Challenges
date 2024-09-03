package programmingChallenge53_58;

import java.util.Scanner;

public class Student_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the minimum number code solution");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num-1 : ");
		int num1 = sc.nextInt();
		System.out.println("The resultant Score is : " + Score(num1));

	}
	public static String Score(int num){
		
		String result  = num > 80 ? "High" : (num > 50 ? "Moderate" : "Low") ;
		return result;
		
	}

}
