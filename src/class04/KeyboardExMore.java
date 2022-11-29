package class04;

import java.util.Scanner;

public class KeyboardExMore {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your name");
//takes a string type input from the keyboard and store in name variable
	String name=scanner.nextLine();
	System.out.println("please enter you age");
	int age=scanner.nextInt();
	//take an int from keyboard and store in age variabe
	System.out.println(" Hi  "+name+"you are "+ age+ "year old");
	
	
	
	
	}

}
