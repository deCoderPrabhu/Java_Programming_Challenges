package programmingChallenge40_50;

import java.util.Scanner;

public class MaxnMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr  = MaxnMin.inputArray();
		int min  = Minnum(numArr);
		int max = Maxnum(numArr);
		
		System.out.println("The maximum number is : " + max);
		System.out.println("The maximum number is : " + min);
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
	public static int Minnum(int[] numArr) {

		int min = Integer.MAX_VALUE ;
		int i  =0;
		while(i < numArr.length){
			if(min > numArr[i]) {
				min = numArr[i];
			}
			i++;
		}
		return min;
		
	}
	public static int Maxnum(int[] numArr) {
		if(numArr.length == 0) {
			return Integer.MAX_VALUE;
		}
		int max = numArr[0];
		int i  =0;
		while(i < numArr.length){
			if(max < numArr[i]) {
				max = numArr[i];
			}
			i++;
		}
		return max;
		
	}

}
