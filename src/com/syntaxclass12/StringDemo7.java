package com.syntaxclass12;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="I am always consfused i was kidding";

	        System.out.println(str.indexOf("a"));
	        System.out.println(str.indexOf("s"));
	        System.out.println(str.indexOf(" "));
	       /* substring() gives you smaller string from a String we can start the starting
	         * part to this method and it will return us the subString from that index
	         */
	        System.out.println(str.substring(5));
// second ones give ending
	        System.out.println(str.substring(5,11));

	}

}
