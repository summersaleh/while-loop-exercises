package pbd;

import java.util.Random;
import java.util.Scanner;

public class GuesserWithCounter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int chosenNumber = 1 + r.nextInt(10);
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it. ");
		
		int guessedNumber = input.nextInt();
		int count = 0;
		count++;
		
		while (guessedNumber != chosenNumber) {
			
			System.out.println("That is incorrect. Guess again.");
			guessedNumber = input.nextInt();
			count++;
		}
		
		if (guessedNumber == chosenNumber) {
		System.out.println("That's right! Good job!");
		System.out.println("It only took you " + count +" guesses");
		} 
		input.close();
	}

}
