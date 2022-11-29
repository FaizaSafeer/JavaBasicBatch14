package class09;

public class exmapl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]week= {"Monday","sunday","tuesday","thursday","friday"};
// if day is sunday >>it is a fun day 
//otherwise ... it is a boring day
for(String day:week) {
	if (day.equals("sunday")) {
		System.out.println(day+" is a fun day");
	}else {
		System.out.println(day+" is a boring day");
	}
	
}
	}

}
