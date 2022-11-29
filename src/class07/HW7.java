package class07;

import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) {
		/*
		 * Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. Keep asking 
		 * to pay for coffee until the user enters the EXACT amount . If the user gives more than 
		 * coffee price --> ask them to give less, if the user gives less money then ask to give more. 
		 * Once user give EXACT amount print “Please enjoy your coffee
		 */


Scanner scan=new Scanner(System.in);
double price ;
do {
	System.out.println("Please pay for the coffee?");
	price=scan.nextDouble();
	if (price>10) {
		System.out.println("Please pay less");
	}else if (price<10) {
		System.out.println("Please paye more");
	}
	}while (price!=10) ;
		System.out.println("enjoy your coffee");


	
	}

}
