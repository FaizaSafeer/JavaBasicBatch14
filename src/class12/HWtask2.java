package class12;

public class HWtask2 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).
		
		String str="Sunday";
		for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i));
        }
		//another method
		char [] charArr=str.toCharArray();
		for(int i=charArr.length-1;i>=0;i--) {
		System.out.print(charArr[i]);
		}
	}

}
