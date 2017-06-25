package pbd;

import java.util.Scanner;

public class PinLockout {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int pin = 1407;
		int tries = 0;
		
		System.out.println("Welcome to SS Bank. \nEnter Your Pin.");
		int entry = input.nextInt();
		tries++;
		
		while(entry != pin && tries < 3) {
			System.out.println("INCORRECT PIN TRY AGAIN. \nENTER YOU PIN:");
			entry = input.nextInt();
			tries++;
		}
		
		if(entry == pin) {
			System.out.println("CORRECT!");
		} else if (tries >= 3){
			System.out.println("YOU HAVE RUN OUT OF TRIES! ACCOUNT LOCKED!");
		}
		
		input.close();
	}

}
