package arrayMethod;

import java.util.Scanner;

public class SumNAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Sum and Averge Program");
		System.out.println("Enter the size of an array");
		int size = input.nextInt();
		int[] arr = new int[size];
		int index = 0;
		while(index < arr.length) {
			System.out.println("Enter the element on " + index + 1 +":" );
			arr[index] = input.nextInt();
			index++;
		}
		int sum = sum(arr);
		double avg = avg(arr,sum);
		System.out.println("The sum of the elements in an array:" + sum);
		System.out.println("The average of the elements in an array:" + avg);

	}
	public static int sum(int[]arr) {
		int i = 0,sum = 0;
		while(i<arr.length) {
			sum += arr[i];
			i++;
		}
		return sum;
	}
	
	public static double avg(int[]arr,int sum) {
		return (double)(sum/arr.length);
	}

}
