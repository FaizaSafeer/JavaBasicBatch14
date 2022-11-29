package class06;

import java.util.Scanner;

public class EnhanceCode22 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F ODO
		 * Auto-generated method stub
		 */
		System.out.println("Enter your quiz score ?");
		Scanner scan = new Scanner(System.in);
		int quiz = scan.nextInt();
		System.out.println("Enter your midterm score?");
		int midTerm = scan.nextInt();
		System.out.println("Enter your final score ?");
		int finalScore = scan.nextInt();

		double average;
		String grade;
		average = quiz + midTerm + finalScore / 3;

		if (average >= 90) {
			grade = "A";
		}
		else if (average >= 70 && average < 90) {
			grade = "B";
		}
		else if (average >= 50 && average < 70) {
			grade = "C";
		}
		else if (quiz + midTerm + finalScore < 50 && average > 0) {
			grade = "F";
		}else {
			System.out.println("Enter valid score");
			grade="valid score";
		}
		
		System.out.println(grade);

	}

}
