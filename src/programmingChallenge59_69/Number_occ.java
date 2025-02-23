package programmingChallenge59_69;

import java.util.Scanner;

public class Number_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = input.nextInt();
		int[] arr = new int[size];
		int i = 0;
		while(i<size) {
			System.out.println("Enter the number in an array:");
			arr[i] = input.nextInt();
			i++;
		}
		System.out.println("Enter the number you want to search");
		int num  =input.nextInt();
		int times = find_occ(arr,num);
		System.out.println("The number of times the number is found in an array is: "+times);

	}
	
	static int find_occ(int[]arr,int num) {
		int count=0;
		for(int i = 0;i<arr.length;i++) {
			if(num==arr[i]) {
				count++;
			}
		}
		return count;
	}

}
