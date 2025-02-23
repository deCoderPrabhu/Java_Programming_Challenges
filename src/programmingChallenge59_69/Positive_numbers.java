package programmingChallenge59_69;

import java.util.Scanner;

public class Positive_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = input.nextInt();
		int[] arr = new int[size];
		int i =0;
		while(i<size) {
			System.out.println("Enter the number");
			arr[i] = input.nextInt();	
			i++;
					}
		int sum  =0;
		for(int j  : arr) {
			if(j < 0) {
				continue;
			}
			sum += j;
			
			
		}
		System.out.println("The sum of positive numbers in the array is: "+sum);

	}

}
