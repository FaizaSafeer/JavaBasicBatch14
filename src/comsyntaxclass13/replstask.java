package comsyntaxclass13;
import java.util.Arrays;
import java.util.Scanner;
public class replstask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write code that will take in a String input and check to see if it is a palindrome or not.
		//Your program will print out "true" if it's a palindrome and "false" if not.
	
		
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    
		  for (int i=s.length()-1;i<=0;i--){
		    System.out.print(s.charAt(i));
		  }
		   
		    
	}

}
