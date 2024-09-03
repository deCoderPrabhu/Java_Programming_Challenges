package programmingChallenge59_69;

import java.util.Scanner;

public class max_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = input.nextInt();
		int[] arr = new int[size];
		
		int i = 0;
		while(i < size) {
			System.out.println("Enter the number at pos:"+ i);
			arr[i] = input.nextInt();
			i++;
		}
		int max = Integer.MIN_VALUE;
		for(int num : arr) {
			if(max < num) {
				max = num;
			}
		}
		System.out.println("The maximum NUmber is:" + max);

	}

}
