package com.syntaxxclass8;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		//
		
		
	System.out.println("-----------------");	
		
	Scanner scan=new Scanner (System.in);
	 int secretno=20;
	do {
		System.out.println("Enter your secret number");
		secretno=scan.nextInt();
		}
		while (secretno!=20);
	System.out.println("you r winner");
	
		System.out.println("----------");
		
		//find sum of even n odd no betwen 1 to 50
		int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
	    	}
	{
		
		
	}

}
