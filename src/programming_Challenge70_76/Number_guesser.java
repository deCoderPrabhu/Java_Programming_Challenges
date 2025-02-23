package programming_Challenge70_76;

import java.util.Scanner;

class Number_guesser {
	
	int random;
	Number_guesser(){
		random = (int)Math.ceil(Math.random() * 100); 
	}
	
	int guesser(int guessNumber) {
		return guessNumber - random;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Number_guesser game = new Number_guesser();
		System.out.println("Welcome to Number guessing game....");
		int guess;
		int result;
		do {
			System.out.println("Enter the number: ");
			guess = input.nextInt();
			result = game.guesser(guess);
			if(result==0) {
				System.out.println("Congrats your Guess is correct");
			}else if(result < 0) {
				System.out.println("Please guess Higher");
			}else {
				System.out.println("Please guess lower");
			}
		}while(result != 0);
	}

}
