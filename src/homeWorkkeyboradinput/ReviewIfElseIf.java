package homeWorkkeyboradinput;

public class ReviewIfElseIf {

	public static void main(String[] args) {
/*if we neeed outcome bases on if conditon we use if
 * if the outcomes are 2 we use if else 
 * if outcomes are more than that we can use if else if

 */
		int number = 0;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");

        }
        if (number == 0) {
            System.out.println("number is 0");

        }

//******second prog**** second prog is prefered n good
        if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");

        }
        else  {
            System.out.println("number is 0");
        }
	}

}
