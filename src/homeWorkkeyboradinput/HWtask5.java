package homeWorkkeyboradinput;

import java.util.Scanner;

public class HWtask5 {

	public static void main(String[] args) {
		/*Create a Java program that will ask user to input city and temperature. Your program should convert
		 *  Fahrenheit into celsius and print “The temperature is the city  is ” (edited)
		 */
Scanner scan=new Scanner(System.in);
System.out.println("What is your city name");
String city=scan.next();
System.out.println("what is the temperature there?");
double temp=scan.nextDouble();
float celsius=(float)(temp-32)*5/9;
	System.out.println("the temperature of " + city +" is "+ celsius );	
		
		
		


	}

}
