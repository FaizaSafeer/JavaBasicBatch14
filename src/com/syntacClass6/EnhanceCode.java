package com.syntacClass6;

import java.util.Scanner;

public class EnhanceCode {

	public static void main(String[] args) {
		System.out.println("What is the time?(use 24 hrs format)");
		Scanner scan=new Scanner(System.in);
		int hour =scan.nextInt();
		 
		String timeOfTheDay;

        if (hour >= 1 && hour <= 11) {
            timeOfTheDay = "Morning";
        } else if (hour >= 12 && hour <= 15) {
            timeOfTheDay="Afternoon";
        } else if (hour >= 16 && hour <= 20) {
            timeOfTheDay="Evening";
        } else if (hour >= 21 && hour <= 24) {
            timeOfTheDay="Night";
        } else {
            System.out.println("Wrong number is entered");
            timeOfTheDay="Invalid";
        }

        System.out.println(timeOfTheDay);

	}

}
