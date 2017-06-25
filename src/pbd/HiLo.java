package pbd;

import java.util.Random;
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner input = new Scanner(System.in);

		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");

		int guess = input.nextInt();
		int randomNumber = 1 + r.nextInt(100);
		int count = 0;
		count++;
		
		while(guess != randomNumber && count < 7) {
		if( guess > randomNumber) {
			System.out.println("Sorry too high, guess again.");
		} else if (guess < randomNumber) {
			System.out.println("Sorry too low, guess again.");
		}
		guess = input.nextInt();
		count++;
		}
		if(guess == randomNumber) {
			System.out.println("You guessed it! What are the odds!");
		} else if( count >= 7) {
			System.out.println("Sorry, you didn't guess in 7 tries");
		}
		input.close();
	}

}
