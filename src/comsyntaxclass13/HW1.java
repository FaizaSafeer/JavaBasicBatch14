package comsyntaxclass13;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a String that will hold a sentence. Write a program to get a new String without 
		//any spaces.
		String str= "What a beautiful day";
		
		String str2=str.replaceAll(" ","");
		System.out.println(str2);
	}


}
