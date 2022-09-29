package groupTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values. After
		//the array is created, calculate the sum of all stored
		//elements in that array.
Scanner scan=new Scanner(System.in);
System.out.println("how many numbers will you enter/size of array");
int size=scan.nextInt();
int[]arr =new int[size];

for (int i=0; i<size; i++) {
	arr[i]=scan.nextInt();
	
}

System.out.println(Arrays.toString(arr));

int sum=0;
 for (int sum1:arr) {
	 sum+=sum1;
 }System.out.println("Sum of all array is " +sum);

	}
}
