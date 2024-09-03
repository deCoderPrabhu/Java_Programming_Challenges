package programmingChallenge53_58;

import java.util.Scanner;

public class even_OddNum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the minimum number code solution");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num-1 : ");
		long num1 = sc.nextLong();
		even_OddNum eveOdd = new even_OddNum();	
		boolean result = eveOdd.even_Odd(num1);
		if(result) {
			System.out.println("The Number is Even");
		}else {
			System.out.println("The number is odd");
		}
		
	}
	
	private boolean even_Odd(long num1) {
		return  (num1%2==0) ? true : false;
	}

}
