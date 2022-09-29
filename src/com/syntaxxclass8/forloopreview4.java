package com.syntaxxclass8;

import java.util.Scanner;

public class forloopreview4 {
public static void main (String[]arg) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter the number");
	int i = scanner.nextInt();
	while (i!=10) {
		System.out.println(i);
		i=scanner.nextInt();
	}
	// we use the code which gives easy clean code .above is easy 
	// other loop with same secnerio
	// all loops are interchangeable 
	// but using one type can make clenaer and understandbale
	for (int k =0; i!=10; k++) {
		System.out.println(i);
		i=scanner.nextInt();
	}
}
}
