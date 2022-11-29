package class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//just one example one eg of primitive date
String name="Asma";
String adress="123 address street";
int phone=1234567890;
String Phone="123 456 7890";// space is maybe considered a specil number
 //String age="17";// anything in double commom its considered as string
int age=17;// age should be int
// type syso +ctrl+space -->auto complete statement
System.out.println(name);
//"my name is" Asma is present in variable name
//one string to another string
//" My name is" +Asma
System.out.println("My name is "+name);
// spaces maater in  doublecoomas
//Asma is 17(attachd string to int
System.out.println(name+" is "+age);
String fruit="apple";
double price=1.99;
//The price of the apple is 1.99
System.out.println("The price of the "+ fruit+" is "+price);
fruit="mango";
price= 5.99;
// the price of mango is 5.99
System.out.println("The price of the "+ fruit+" is "+price);
/*to attach any value(int,boolean,char etc)
 * to string we use +
 * +next to string acts as concatenation
 */
String name1="Faiza";
String lastname="Safeer";
char grade='A';
String city="Newcastle";
String state="NSW";
String phoneno="0496123218";
System.out.println("My name is "+name1+" and my last name is "+ lastname);
System.out.println("I am "+grade+" student");
System.out.println("I live in "+city+" and state "+state);
System.out.println("My phone no. is "+phoneno);


city="vancouer";
state="BC";
phoneno="123456";
System.out.print("My name is "+name1+" "+lastname);
System.out.print(" I move to new "+city+" and new state "+state);
System.out.print(" My new phone no. is "+phoneno);
/*names fir indenfier=names to variables,methods
 * 1.cannot use keywords as identiffers
 * String new="Hello"'---> error new is keyword
 * 2.cannot have spaces in identifers
 * 3.identifers cannot start with numbers
 * int 1number=123; error cant strt
 * int number1=123; no error doesnt strt with no.
 * 4. indentifers cannot contain any special characters except $ or _(underscore_
 * double $price=9.88;--> allowed
 */
// Naming conventions(preferences)
/*1.class should strt with uupercase then follow camelcase 
 *2. Variable should startwith lower class then follow camelcase
 * String is class thats y capitalised
 * String myWeather="cold";
 */
	}

}
