package com.syntaxxclass8;

public class HWNestedloops {

	public static void main(String[] args) {
		// Create a digital clock using nested loops

//If you can, try to have a clock that would show 2 digits for hour and 2 digits for minutes

		for (int i=00; i<=23 ; i++) {
			for (int j=0 ; j<=59; j++) {
				System.out.println(i+":"+j);
			}
		}
		
		System.out.println("----another way--------");
		for (int h=00; h<=23; h++) {
		   for (int m=0; m<=59 ; m++) {
			   
		   if (h<=9 && m<=9) {
			   System.out.println("0"+h+":"+"0"+m);
		   }else if (h>9 && m<=9) {
			   System.out.println(h+":"+"0"+m);
		   }else if (h<=9 &&m>9) {
			   System.out.println("0"+h+":"+m);
		   }
		   
		   else {
			   System.out.println(h+":"+m);
		   }
		   }
		}
		
		
	}

}
