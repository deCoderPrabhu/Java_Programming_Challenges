package programmingChallenge59_69;

import java.util.Scanner;

public class Fibonacci_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number till you want the fibonacci series ");
		int size = input.nextInt();
		for(int i =0;i<size;i++) {
			System.out.println(fibonacci(i));
		}
		
	}
	
	public static int fibonacci(int size) {
		if(size==0) {
			return 0;	
		}
		if(size==1) {
			return 1;
		}
		else{
			return fibonacci(size-1) + fibonacci(size-2);
		}
		
		
		
		
	}

}
