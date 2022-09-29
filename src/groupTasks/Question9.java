package groupTasks;

public class Question9 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		int[] num = { 34, 56, 11, 45, 67, 43, 678, 67, 65, 67 };
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			{
				if (num[i] > max) {
					max = num[i];
				}
			}

		}
		System.out.println(max);
		int min=num[0];
		for (int i =0; i<num.length; i++) {
			if (num[i]<min) {
				min=num[i];
			}
		}System.out.println(min);

	}

}
