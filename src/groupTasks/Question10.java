package groupTasks;

public class Question10 {
	public static void main(String[]arg) {
		//Write a java program to find the second largest
		//number in the array
		int []num= {4,6,4,5,45,3,345,45,56,76,97};
		int largest=0;
		int secLargest=0;
		for (int i=0; i<num.length; i++) {
			if(num[i]>largest) {
				largest=num[i];
				
				}
			}System.out.println(largest);
	}
		
	}


