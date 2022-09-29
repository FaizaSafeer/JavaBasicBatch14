package homeWorkkeyboradinput;

import java.util.Scanner;

public class HWtask3 {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed. If loan is less or equal 
		 * to 200,000 then you would lend the money otherwise you would reject the client.
		 */
Scanner scanner=new Scanner(System.in);
System.out.println("How much load do you need?");
double loanNeeded=scanner.nextDouble();
if(loanNeeded<=200000) {
	System.out.println("You can get the loan");
}else {
	System.out.println("We cant accept your loan");
}
		
		
		
		
	}

}
