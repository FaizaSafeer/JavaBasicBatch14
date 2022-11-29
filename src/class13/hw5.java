package class13;

public class hw5 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? aba=> true
		//Abbc =>false
		String str1="mom";
StringBuilder str=new StringBuilder(str1);
str.reverse();
if(str.toString().equals(str1)){
    System.out.println("The String is Palindrome");
}else {
    System.out.println("The String not Palindrome");
}
	}

}
