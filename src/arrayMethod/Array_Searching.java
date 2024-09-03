package arrayMethod;

import java.util.Scanner;

public class Array_Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Array Searching Tutorial");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number you want to search");
		int num = input.nextInt();
		
		//creating and array
		int[] myArr = {32,45,26,12,78,2,3,4,5};
		//Searching the value
		boolean isfound_num = isfound( myArr, num);
		if(isfound_num) {
			System.out.println("The searched value is found in an array");
		}else {
			System.out.println("Value not found! Please Try Again....");
		}
	}
		
	public static boolean isfound(int myArr[], int num) {
		int index =0;
		while(index < myArr.length ) {
			if(myArr[index]  == num) {
				System.out.println("Index is: " + index);
				return true;
			}
			index++;
		}
		return false;
		
	}
}
