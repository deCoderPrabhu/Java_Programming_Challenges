package programmingChallenge53_58;

import java.util.Scanner;

public class Year_Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Month Finder code solution");
		Scanner sc = new Scanner(System.in);
		month_Finder();
	}
	public static void month_Finder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month : ");
		int  value  = sc.nextInt();
		switch(value){
			case 1: 
				System.out.println("January");
			break;
			case 2: 
				System.out.println("Feburary");
			break;
			case 3: 
				System.out.println("March");
			break;
			case 4: 
				System.out.println("April");
			break;
			case 5: 
				System.out.println("May");
			break;
			case 6: 
				System.out.println("June");
			break;
			case 7: 
				System.out.println("July");
			break;
			case 8: 
				System.out.println("August");
			break;
			case 9: 
				System.out.println("September");
			break;
			case 10: 
				System.out.println("October");
			break;
			case 11: 
				System.out.println("November");
			break;
			case 12: 
				System.out.println("December");
			break;	
			default:
				System.out.println("Please enter the valid initial");
		}
	}

}
