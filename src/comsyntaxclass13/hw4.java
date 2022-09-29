package comsyntaxclass13;

public class hw4 {

	public static void main(String[] args) {
		// How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
		
		String s="This is sentence i want to reverse";
		
	for (int i=s.length()-1; i<=0; i--) {
		for (int j=s.length(); j<=0; j--) {
			System.out.println(s.charAt(i));
		}
	}
		
		
		
		
		
//StringBuilder str=new StringBuilder("This is sentence i want to reverse");
//str.reverse();
//System.out.println(str);
	}

}
