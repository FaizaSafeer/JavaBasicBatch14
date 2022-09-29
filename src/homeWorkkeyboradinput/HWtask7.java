package homeWorkkeyboradinput;

import java.util.Scanner;

public class HWtask7 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("How much years have you worked");
		double worked = input.nextDouble();
		if (worked >= 5) {
			System.out.println("You are eligible for the bonus");
			System.out.println("What is your salary?");
			double salary = input.nextDouble();
			if (salary > 50000) {
				System.out.println("Your bonus is 5000");
			}
			if (salary < 50000) {
				System.out.println("Your bonus is 300");
			}

		} else {
			System.out.println("You are not eligible for the bonus");
		}

	}

}
