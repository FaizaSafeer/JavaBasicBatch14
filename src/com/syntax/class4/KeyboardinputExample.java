package com.syntax.class4;

import java.util.Scanner;

public class KeyboardinputExample {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);// bring all methods from scanner class
	System.out.println("Please enter your age");
	int age=scanner.nextInt();//we use nextint if we want an int type of data from the keyboard

	if(age<18) {
		System.out.println("you should study");
	}else {
		System.out.println("you should start working");
	}
		
		

	}

}
