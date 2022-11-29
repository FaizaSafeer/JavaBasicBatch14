package class04;

public class NestedIfCondition {

	public static void main(String[] args) {
int time=9;
String day="monday";
/*it is called outer if condition if it is true then 
 * only inner conditon will be checked if it is false
 * nothing fromm inner if conditon is excecuted its like main door
 * if main door is close we cant enter
 * 
 */
if(day.equals("monday")) {//as string in non primitive we cant use ==sign we use equals
	
	if(time>7) {
		System.out.println("lets go to office");
	}
}if (time<6) {
	System.out.println("Lets sleep more");
}

	}

}
