package com.syntaxxclass8;

public class review3loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//print 1 3 7 9	
		
		for (int i =1; i<=9; i+=2) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
			
		}
		
		
		//or
		for (int i =1; i<=9; i+=2) {
			if(i!=5) {
				
			}
			System.out.println(i);
			
		}
	}

}
