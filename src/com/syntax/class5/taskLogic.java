package com.syntax.class5;

import java.util.Scanner;

public class taskLogic {

	public static void main(String[] args) {
		/*1. Prompt the user to enter person heights
		 *  in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
		 
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Please enter your height in inches.");
double height= scan.nextDouble();
if (height<60) {
	System.out.println("Short");
}else if (height<=72 && height >=60) {
	System.out.println("medium");
}else if (height>72) {
	System.out.println("tall");
}
/*
 *  Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output
 *   “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
 */
int day=7;
if(day>=1 && day <=5) {
	System.out.println("This is week day");
}else if (day>=6 && day <=7) {
	System.out.println("it is weekend");
}else {
	System.out.println("invlid");
}

// another way solve
/*
 * 3. Ask user to enter a number and then define if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000
 */
System.out.println("Enter a number");
double num=scan.nextDouble();
if (num>=1 && num<=10) {
	System.out.println("Small number");
}else if (num>=11 && num<=100) {
	System.out.println("Medium number");
}else if (num>=101 && num<=1000) {
	System.out.println("Large number");
}



	}

}
