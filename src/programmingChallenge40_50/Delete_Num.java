package programmingChallenge40_50;

import java.util.Scanner;

import arrayMethod.Array_Utility;

public class Delete_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr  = Delete_Num.inputArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index value you want to delete : ");
		int indX = sc.nextInt();
		int[] newArr = delete_num(numArr,indX);
		System.out.println("The Updated array is : ");
		Delete_Num.displayArray(newArr);

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
	public static int[] delete_num(int[] numArr, int indX) {
		int occ = Find_occurrences.Occurences(numArr, indX);
		if(occ == 0) {
			return numArr;
		}
		int newSize = numArr.length - occ;
		int[] newArr = new int[newSize];
		int i = 0, j =0;
		while(i < numArr.length) {
			if(indX != numArr[i]) {
				newArr[j] = numArr[i];
				j++;
			}
			i++;
		}
		return newArr;
	}

}
