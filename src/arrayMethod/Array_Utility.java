package arrayMethod;

import java.util.Scanner;

public class Array_Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static int[] inputArray() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("The Size of the numbers are : ");
		int size = input.nextInt();
		int[] nums = new int[size];
		int i =0;
		while(i<size) {
			System.out.println("Enter the number " + (i+1) + " : " );
			nums[i] = input.nextInt();
			i++;
			
		}
		return  nums;
	}
	public static int[] displayArray(int[]numArr) {
		int i =0;
		while(i < numArr.length) {
			System.out.print(numArr[i] + " ");
			i++;
		}
		return numArr;
	}

}
