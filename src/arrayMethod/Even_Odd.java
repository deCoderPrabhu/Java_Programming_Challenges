package arrayMethod;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Even and Odd program.......");
		int i = 0;
		System.out.println("Enter the number of elements in an array: ");
		int size  = input.nextInt();
		int[] arr = new int[size];
		while(i < size) {
			System.out.println("Enter the number");
			arr[i] = input.nextInt();
			i++;
		}
		even_odd(arr);
		
	}
	
	public static boolean even_odd(int[]arr) {
		int  i =0;
		while(i < arr.length) {
			if(arr[i]%2 == 0) {
				System.out.println("The number is even" + "\n The index is: " + i);
			}else {
				System.out.println("The number is odd" + "\n The index is: "+i);
			}
			i++;
		}
		return false;
	}

}
