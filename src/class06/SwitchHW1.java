package class06;

import java.util.Scanner;

public class SwitchHW1 {

	public static void main(String[] args) {
		// 1. Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		Scanner scan=new Scanner(System.in);
		System.out.println("Where are you fromm?");
		String country=scan.nextLine();
		
		String language;
		switch(country){
		case "England":
				language="English";
				break;
		case "Pakistan":
			language="Urdu";
			break;
		case "Germany":
			language="Deutch/German";
			break;
		case "Australia":
			language="English";
			break;
		case "Saudi Arabia":
			language="Arabic";
			break;
		default:
			language="Dont know";	
		}
		System.out.println("People of "+ country+" speaks "+language );
		
		
		
	}

}
