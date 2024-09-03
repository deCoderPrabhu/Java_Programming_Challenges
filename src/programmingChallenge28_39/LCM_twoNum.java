package programmingChallenge28_39;

import java.util.Scanner;

public class LCM_twoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = readNumber();
		int LCM = lcm_Num(num1);
		System.out.println("The LCM of the number is :" + LCM);

	}
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1 = input.nextInt();
		return num1;
		
	}
	public static int lcm_Num(int num1) {
		int lcm = 1;
		int i = 2;
		while(i<num1) {
			int factor = num1/i;
			lcm *= factor;
			num1 /= i;
			i++;	
		}
		return lcm;
	}

}
