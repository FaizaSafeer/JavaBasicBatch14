package syntaxClass03;

public class Recap {

	public static void main(String[] args) {
	//
	String firstName="Mina";
	String lastName="Henen";
	System.out.print(firstName);
	System.out.println(lastName);	
	String fullName=firstName+" "+lastName;
	System.out.println(fullName);
	
	int houseNo=15;
	int apartmentNo=5;
	String streetName="The street";
	String city="New York";
	String country="USA";
	String fullAdress=apartmentNo+" "+houseNo+" "+streetName+city+" "+country;
	System.out.println(fullAdress);	
	
	String incompleteAdress=houseNo+city;
	String step1="if we subtract 10 from 5 we get="+10;//result is a string

	System.out.println(step1);//it is not defined java does not understand wat to do wen we ask her to subtract
	// a string from a no it complains
	//String step2=step1-5
	
			
System.out.println("if we subtract 10 from 5 we get = "+(10-5));
	
	
	}

}
