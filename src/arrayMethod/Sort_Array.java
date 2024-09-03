package arrayMethod;

import java.util.Scanner;

public class Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		System.out.println("Welcome to Sort an Array program......");
		System.out.println("Enter the size of an array:");
		int size = input.nextInt();
		int[] numArr = new int[size];
		for(int i =0; i<size;i++) {
			System.out.println("Enter the element:");
			numArr[i] = input.nextInt();
			
		}
		int[] sortArr = sortedArray(numArr);
		System.out.println("Sorted Array is: ");
		int i =0;
		while(i < sortArr.length) {
			System.out.println(sortArr[i]);
			i++;
		}

	}
	
	public static int[] sortedArray(int[] numArr) {
		
		for(int i =1; i< numArr.length;i++) {
			for(int j =0; j<=i; j++) {
				if(numArr[i] == numArr[j]) {
					break;
				}
				if(numArr[i] < numArr[j]) {
					int num = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = num;
				}
			}
		}
		return numArr;
	}

}
