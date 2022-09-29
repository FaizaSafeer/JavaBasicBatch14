package com.syntax.class5;

import java.util.Scanner;

public class HomeTaskLogic {

	public static void main(String[] args) {
		/* Write a program that will ask user to input inputs the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
		 */
System.out.println("What is the time?(use 24 hrs format)");
Scanner scan=new Scanner(System.in);
int time =scan.nextInt();
if (time>=0100 && time<=1100) {
	System.out.println("Morning");
}else if (time>=1200 && time<=1500) {
	System.out.println("Afternoon");
}else if (time>=1600 && time<=2000) {
	System.out.println("Evening");
}else if (time>=2100 && time<=2400) {
	System.out.println("Night");
}else {
	System.out.println("Invalid time");
}
		
		/*Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring” 
if user is born in June, July, August → 
season =”Summer”  etc …
		 
		 */
		System.out.println("Enter your birth month");
		String month=scan.next();
		if (month.equals("March") || month.equals("April") ||month.equals("May"))
		 {
			System.out.println("It is Spring");
		}else if  (month.equals("June") || month.equals("July") ||month.equals("August")) {
			System.out.println("It is Summers");
		}else if  (month.equals("September") || month.equals("October") ||month.equals("November")) {
			System.out.println("It is Autumn");
		}else if (month.equals("December") || month.equals("January") ||month.equals("Feburuary")) {
			System.out.println("It is Winter");
		}else {
			System.out.println("invalid month");
		}
		
		
		
	}

}
