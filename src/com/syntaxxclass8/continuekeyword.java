package com.syntaxxclass8;

public class continuekeyword {

	public static void main(String[] args) {
		for (int i =1; i<5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
			System.out.println("Hello");
	//  i wantto print number from 1 to 20 except no 6 7 8		
		}
for (int i =1; i<=20; i++ ) {
	if (i==3 || i==7 || i ==11) {
		continue;
	}System.out.println(i+" ");
}
		
// continue to next iteration/cyle
// the moment java sees continue->it goes back to the begining of loop
		
	}

}
