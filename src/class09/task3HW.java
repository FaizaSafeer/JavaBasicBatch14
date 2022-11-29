package class09;

public class task3HW {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array
 int []num= {3,6,9,12,15,18,21,24,27,30};
  int sum=0;
  for(int i =0; i<num.length;i++) {
	  sum+=num[i];
  }System.out.println(sum);
	  
//other way
  sum=0;
  for (int number:num) {
	  sum+=number;
  }System.out.println(sum);
	 
 
		
	}
	}

