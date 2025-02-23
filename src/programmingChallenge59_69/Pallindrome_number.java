package programmingChallenge59_69;

import java.util.Scanner;

public class Pallindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		System.out.println("Welcome to recursive pallindrome");
		System.out.println("Enter the string");
		String pallin = input.next();
		
		System.out.println("Your String is:"+ ((ispallin(pallin)? "Pallindrome" : "Not Pallindrome")
			));
		
		
		

	}
	public static boolean ispallin(String pallin) {
		
		if(pallin.length()<=1) {
			return true;
		}
		if(pallin.charAt(0)!=pallin.charAt(pallin.length()-1)) {
			return false;
		}
		String newstr = pallin.substring(1,pallin.length()-1);
		return ispallin(newstr);
	}

}
