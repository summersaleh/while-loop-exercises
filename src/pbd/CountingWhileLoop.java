package pbd;

import java.util.Scanner;

public class CountingWhileLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in a message, and i'll display it five times.");
		System.out.println("Message:");
		String message = input.nextLine();
		
		int n = 0;
		while (n <5) {
			System.out.println((n+1) + "." + message);
			n++;
		}
		
		input.close();
	}

}
