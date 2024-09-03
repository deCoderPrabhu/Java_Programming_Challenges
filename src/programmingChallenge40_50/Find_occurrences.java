package programmingChallenge40_50;

import java.util.Scanner;

public class Find_occurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numArr  = Find_occurrences.inputArray();
		System.out.println("Enter the number which can occur in the array : ");
		int num = sc.nextInt();
		int count = Occurences(numArr, num);
		if(count > 0) {
			System.out.println("The number of occurences are : " + count);
		}else {
			System.out.println("OOPS! the number not found");
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
	public static int Occurences(int[] numArr, int num) {
		int i = 0;
		int count = 0;
		while(i < numArr.length) {
			if(num == numArr[i]) {
				count++;
			}
			i++;
		}
		return count;
	}

}
