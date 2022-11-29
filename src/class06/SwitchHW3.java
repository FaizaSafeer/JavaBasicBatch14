package class06;

import java.util.Scanner;

public class SwitchHW3 {

	public static void main(String[] args) {
		/*  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
		 *  Based on operator provide the result to user.
            Please complete this assignment in 2 ways: using if statement and switch case.
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Enter any number ");
int num1=scan.nextInt();
System.out.println("Enter another number");
int num2=scan.nextInt();
System.out.println("What operation do you want?");
char operation=scan.next().charAt(0);

int result = 0;
		
	switch(operation)	{
	case '+':
		result=num1+num2;
	    break;
	case '-':
		result=num1-num2;
	    break; 
	case '/':
		result=num1/num2;
	    break;
	case '*':
		result=num1*num2;
	    break;
	}
	System.out.println(result);
	
	
	// other way
	System.out.println("Enter a number ");
	int x=scan.nextInt();
	System.out.println("Enter one more number ");
	int y=scan.nextInt();
	System.out.println(" what operation do you want to be done");
	char operator=scan.next().charAt(0);
	if (operator=='+') {
		System.out.println(x+y);
	}else if (operator=='-') {
		System.out.println(x+y);
	}else if (operator=='/') {
		System.out.println(x/y);
	}else if (operator=='*') {
		System.out.println(x*y);
	}
	
	}

}
