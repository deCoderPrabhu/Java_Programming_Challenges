package programmingChallenge40_50;


import java.util.Scanner;

public class SumNavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr  = SumNavg.inputArray();
		int i =0;
		int sum = 0;
		while(i < numArr.length) {
			sum += numArr[i];
			i++;
		}
		System.out.println("The Sum of the numbers are : " + sum );
		int avg = sum/(numArr.length);
		System.out.println("The Average of the numbers are : " + avg );
		
		

	}

	private static int[] inputArray() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("The Size of the numbers are : ");
		int size = input.nextInt();
		int[] nums = new int[size];
		int i =0;
		while(i<size) {
			System.out.println(" Enter the number " + (i+1) + " : " );
			nums[i] = input.nextInt();
			i++;
			
		}
		return  nums;
	}

}
