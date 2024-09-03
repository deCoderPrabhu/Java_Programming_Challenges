package programmingChallenge59_69;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  =new Scanner(System.in);
		System.out.println("Enter the password:");
		String password = input.next();
		int atmpts = 2;
		if(password(password,atmpts)) {
			System.out.println("The Password is:"  + password);
			
		}else {
			System.out.println("Sorry You exceeded the Limit..Please try Again later...");
		}
	}
	
	public static boolean password(String password,int atmpts) {
		
		if(password.length() > 6) {
			return true;
		}else if(atmpts > 0) {
			System.out.println("the passord is less than 6 digits");
			System.out.println("Enter the password:");
			Scanner input  = new Scanner(System.in);
			String newPassword = input.next();
			password(newPassword,atmpts-1);
		}
		return false;
	}

}
