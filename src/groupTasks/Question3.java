package groupTasks;

public class Question3 {

	public static void main(String[] args) {
		// . Create a 2D array of integer values. Print the sum of
	//	all numbers
int [][]num= {
		{ 2,4,6,7,4,8 },
		{7,5,8,3,5,6}
};
int sum=0;
//for (int r1[]:num) {
//	for (int r2:r1) {
//		sum+=r2;
//}System.out.println(sum);
//}
for (int i =0; i<num.length;i++) {
	for (int j =0; j<num[i].length;j++) {
		sum+=num[i][j];
	}
}System.out.println(sum);
	}
}


