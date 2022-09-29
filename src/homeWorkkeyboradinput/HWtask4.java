package homeWorkkeyboradinput;

import java.util.Scanner;

public class HWtask4 {

	public static void main(String[] args) {
		/*You are DMV representative and you need to ask customer their age. If they are 18 and older you will issue a driver 
		 * licence to them, otherwise you will offer them to get a learners permit.
		 */
Scanner scanner=new Scanner(System.in);
System.out.println("what is your age?");
int age=scanner.nextInt();
if(age>=18) {
	System.out.println("You can get a licence");
}else {
	System.out.println("you can get learners permit");
}
		
		
		
	}

}
