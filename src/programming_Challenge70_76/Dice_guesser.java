package programming_Challenge70_76;

import java.util.Scanner;

public class Dice_guesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  =new Scanner(System.in);
		System.out.println("Welcome to Dice Guesser game");
		System.out.println("Roll a Dice....");
		System.out.println(".........");
		for(int i =0;i<20;i++) {
		int num = (int)Math.ceil(Math.random()*6);
		
		switch(num) {
		
		case 1: System.out.println("The Dice Number is 1");
		break;
		case 2: System.out.println("The Dice Number is 2");
		break;
		case 3: System.out.println("The Dice Number is 3");
		break;
		case 4: System.out.println("The Dice Number is 4");
		break;
		case 5: System.out.println("The Dice Number is 5");
		break;
		case 6: System.out.println("The Dice Number is 6");
		break;
		default: System.out.println("Roll Again...Invalid roll");
		}
		}

	}

}
