package arrayMethod;

import java.util.Scanner;

public class TwoDimensionalSearching {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner input  = new Scanner(System.in);
	System.out.println("Welcome to 2-D Array Searching......");
	System.out.println("Enter the number of rows");
	int rows = input.nextInt();
	System.out.println("Enter the number of columns");
	int col  = input.nextInt();
	int[][] numArr =  new int[rows][col];
	
	int i  = 0;
	while(i < rows) {
		for(int j = 0; j< col; j++) {
			System.out.println("Enter the Element");
			numArr[i][j] = input.nextInt();
			
		}
		i++;
	}
	System.out.println("Enter the number you wanted to search:");
	int num = input.nextInt();
	boolean isfound_num = isfound(numArr,num);
	if(isfound_num) {
		System.out.println("The number is found in an array");
	}else {
		System.out.println("Invalid Number! Please Try Again......");
	}
	
	}	
	
	public static boolean isfound(int[][]numArr, int num) {
		int i  =0;
		while(i < numArr.length) {
			for(int j = 0; j< numArr[i].length;j++) {
				if(num == numArr[i][j]) {
					System.out.println("The index of the element is:" + j);
					System.out.println("The position of the element is i:" + i + " j: " + j);
					return true;
				}
			}
			i++;
		}
		return false;
	}
	

}
