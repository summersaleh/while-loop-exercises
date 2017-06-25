package pbd;

import java.util.Scanner;

public class AddingValues {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("I will add up the numbers you give me.");

		int number = input.nextInt();
		int count = 0;
		count = number;

		while (number != 0) {
			System.out.println("The total so far is " + count);
			number = input.nextInt();
			count = count + number;

		}

		System.out.println("The total is " + count);

		input.close();
	}

}
