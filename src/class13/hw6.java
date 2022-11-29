package class13;

public class hw6 {

	public static void main(String[] args) {
		// How would you swap  2 strings without a temporary variable?
		String str1="Faiza";
		String str2="Safeer";
		str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);
	}

}
