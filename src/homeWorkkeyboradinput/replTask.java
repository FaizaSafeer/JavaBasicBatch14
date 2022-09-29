package homeWorkkeyboradinput;

import java.util.Scanner;

public class replTask {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Is it sunny outside?");
	boolean isSunny = scan.nextBoolean();
	if(isSunny) {
		System.out.println("Is is a sunny day , i should go somewhere out!");
		System.out.println("Whats the temperature?");
		int temp=scan.nextInt();
		if (temp>80) {
			System.out.println("i should go to beach");
		}else {
			System.out.println("i should go to pRK");
		}
	}else {
		System.out.println("I should study");
	}
	
    
	
	
	
	
	
	
	

	}

}
