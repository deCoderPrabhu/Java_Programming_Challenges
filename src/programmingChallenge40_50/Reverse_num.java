package programmingChallenge40_50;

import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr  = Reverse_num.inputArray();
		int[] newArr = reverse_array(numArr);
		System.out.println("The Updated array is : ");
		Reverse_num.displayArray(newArr);

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
	public static int[] displayArray(int[]numArr) {
		int i =0;
		while(i < numArr.length) {
			System.out.print(numArr[i] + " ");
			i++;
		}
		return numArr;
	}
	public static int[] reverse_array(int[] numArr) {
		int[] newArr = new int[numArr.length];
		int i =0, j = numArr.length-1;
		while(i < numArr.length) {
			newArr[j] = numArr[i];
			j--;
			i++;
		}
		return newArr;
	}

}
