package homeWorkkeyboradinput;

import java.util.Scanner;

public class HWtask6 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a credit card");
		String card = scan.next();
		if (card.equals("yes")) {
			System.out.println("we have few offers");
			System.out.println("What is the balance on the card?");
			double balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off imediately");

			} else {
				System.out.println("You can spend more");
			}

		} else {
			System.out.println("you can have it,its really good");}

	}

}
