package groupTasks;

public class Question5 {

	public static void main(String[] args) {
	//Create a 2D array of integers. Develop a program
		//which will calculate the sum of even and odd numbers
		//for that array
int [][]nums= {
		{2,3,4,5,6,7,8},
		{12,13,14,15,16},
		{22,23,24,25,26,27,28}
};
int sumEven=0;
int sumOdd=0;
for (int[]num1:nums) {
	for (int num2:num1) {
		if(num2%2==0) {
			sumEven+=num2;
		}else {
			sumOdd+=num2;
		}
		
	}
}

System.out.println("sum of even numbers is "+ sumEven);
System.out.println("sum of even numbers is "+ sumOdd);

	}

}
