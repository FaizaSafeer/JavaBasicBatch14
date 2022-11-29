package class06;

import java.util.Scanner;

public class EnhanceHWcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your birth month");
		Scanner scan=new Scanner(System.in);
		String month=scan.next();
		String BirthMonth = null;
		if (month.equals("March") || month.equals("April") ||month.equals("May"))
		 {
			BirthMonth="Spring";
		}else if  (month.equals("June") || month.equals("July") ||month.equals("August")) {
			BirthMonth="Summers";
		}else if  (month.equals("September") || month.equals("October") ||month.equals("November")) {
			BirthMonth="Autmn";
		}else if (month.equals("December") || month.equals("January") ||month.equals("Feburuary")) {
			BirthMonth="Winter";
		}
		
			System.out.println(BirthMonth+ " is your birth month");
		}
	}


