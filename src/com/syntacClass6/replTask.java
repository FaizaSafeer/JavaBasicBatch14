package com.syntacClass6;

import java.util.Scanner;

public class replTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Do you need loan?");
		Scanner scan = new Scanner(System.in);
		boolean ans = scan.nextBoolean();
		if (ans) {
			System.out.println("What is your score?");
			int score = scan.nextInt();
			if (score < 600) {
				System.out.println("Not eligible");
			} else if (score >= 600 && score <= 700) {
				System.out.println("Maybe eligible");

			} else if (score >= 701 && score <= 800) {
				System.out.println("Eligible");
			} else if (score > 800) {
				System.out.println("Definately eligible");
			}
		} else {
			System.out.println("Unknown");
		}

	}

}
