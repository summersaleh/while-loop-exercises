package pbd;

import java.util.Scanner;

public class EnterYourPin {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int pin = 1407;
		
		System.out.println("Welcome to SS Bank.");
		System.out.println("Please enter you pin number:");
		
		int entry = input.nextInt();
		
		while (entry != pin)
		{
			System.out.println("INCORRECT PIN. TRY AGAIN");
			System.out.println("ENTER YOUR PIN");
			entry = input.nextInt();
		}
		System.out.println("PIN HAS BEEN ACCEPTED!");
		
		input.close();
	}

}
