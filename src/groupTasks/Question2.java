package groupTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Using Scanner create an array of countries. When an
		//array is created, retrieve all values from it and while
			//retrieving those values print capital for each country.
			//(use 2 different loops).
		
Scanner scan=new Scanner(System.in);
System.out.println("How many countries will u enter?");
int size=scan.nextInt();
// Two arrays one to store the counties and the other one to store the capitals
String []countries=new String[size];
String[]capitals=new String[size];
// This is just to consume that extra enter that we will be getting from line
// number 18
scan.nextLine();
  for (int i=0; i<size; i++) {
	  System.out.println("Enter country name ");
	  countries[i]=scan.nextLine();
	  
	  System.out.println("enter capital of "+ countries[i] );
	  capitals[i]=scan.nextLine();
  }
  // Prints the arrays in a good format
  System.out.println(Arrays.toString(countries));
  System.out.println(Arrays.toString(capitals));
  for (int i = 0; i < size; i++) {

      System.out.println("The Country " + countries[i] + " Has the capital " + capitals[i]);

  }

	}

}
