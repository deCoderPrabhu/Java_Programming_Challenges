package programmingChallenge59_69;

import java.util.Scanner;

class Multiplication_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  table Number: ");
		int num = input.nextInt();
		int  i = 1;
		multi_table(num,i); 

	}
	
	static void multi_table(int num,int i) {
		if(i==11) {
			System.out.println("Table is Compeletd");
		}else {
			int num1 = num * i;
			System.out.println(num+" * "+i+" = "+num1);
			multi_table(num,i+1);
		}
	}

}
