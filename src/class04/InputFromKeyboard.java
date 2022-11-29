package class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/*Scanner is a class that helps to take the input
		 * from the keyboard,it contains many smaller modules
		 * called method that can help us take string,boolean 
		 * basically all type of data from keyboard
		 * 
		 * 
		 */
	Scanner input=new Scanner(System.in);
	// a message will be displayed to the user on console
	//to enter his/her name
	System.out.println("Please enter your name");
	//activates the java prog to take input from the keyboard
	//and store it inside the name variable
String name=input.next();
//prints watever name the user enter on the keyboard

System.out.println("Hello "+name+"dont be confuse");
	}

}
