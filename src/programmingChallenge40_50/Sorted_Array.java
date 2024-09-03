package programmingChallenge40_50;

import java.util.Scanner;

public class Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr  = Sorted_Array.inputArray();
		boolean isSorted = is_Sorted(numArr);
		if(isSorted) {
			System.out.println("The Array is Sorted");
		}else {
			System.out.println("Sort the Array");
		}

	}
	private static int[] inputArray() {
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
	public static boolean is_Sorted(int[] numArr) {
		boolean is_Sorted = false;
		int  i = 1;
		while(i < numArr.length) {
			if(numArr[i] > numArr[i-1]) {
				is_Sorted =  true;
			}else {
				break;
			}
			i++;
		}
		return is_Sorted;
	}

}
