package com.syntax.class4;

import java.util.Scanner;

public class KeyboardEg7 {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
System.out.println("Did u solve replit assignment answer in true or false?");
boolean solveAnyRepls=scanner.nextBoolean();

if(solveAnyRepls)
{
	System.out.println("Hiw many Repls you solved ?");
	int noOfReplsSolved=scanner.nextInt();
	if (noOfReplsSolved>=17) {
		System.out.println("you are doing great");
	}else if (noOfReplsSolved>10) {
		System.out.println("you are doing ok please complete ASAP");
	}else {
		System.out.println("you should complete more more");
	}
}else
{
	System.out.println("they are v imp to learn java please sove them");
}







	}

}
