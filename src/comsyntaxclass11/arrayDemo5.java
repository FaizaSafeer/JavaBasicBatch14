package comsyntaxclass11;

import java.util.Arrays;
import java.util.Scanner;

public class arrayDemo5 {

	public static void main(String[] args) {
	Scanner Scanner=new Scanner(System.in);
	 System.out.println("Please enter the number of dresses you want to buy");
     int noOfDresses = Scanner.nextInt();

     double[] prices = new double[noOfDresses];

     for (int i = 0; i < noOfDresses; i++) {
         System.out.println("Plz enter price of dress no "+ (i+ 1));
         prices[i]=Scanner.nextDouble();
     }
     System.out.println(Arrays.toString(prices));

     double sum=0;
     for (double price:prices) {
         sum+=price;
     }
     System.out.println("total for all the dresses = "+sum);
 }

//limitations of enhanced loop
//we can only go in one direction
//we can't skip the elements
//we can't use enhanced for loop to update the elements in an array
//we can only use it to access the elements
	

	}


