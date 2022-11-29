package class06;

public class LogicalNot {

	public static void main(String[] args) {
/*it reverse the statemnt /reverse conditon
 * 
 */
boolean boo=!true;
System.out.println(boo);//false
boolean boo1=!false;
System.out.println(boo1);//true

boolean rain=false;
if (!rain) {
	System.out.println(" i will go for a walk");
}
String day ="Sunday";
if (!day.equals("Sunday")) {
	System.out.println("Today is not sunday");
}
boolean checkboxSelected=true;
if(!checkboxSelected) {  //not true = false
	System.out.println("I will click and select it");
}






System.out.println("End of the progeam");
	}

}
