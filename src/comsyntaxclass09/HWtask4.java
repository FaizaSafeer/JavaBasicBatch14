package comsyntaxclass09;

public class HWtask4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		int [] num= {23,45,65,87,98,44,567,65,66};
		int largest=0;
		for (int i =0; i<num.length; i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
		}System.out.println("the largest number is "+ largest);
			
System.out.println("----");
largest =num[0];

	

	}

}
