package class11;

public class Pphone {
//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung 
	//with specific  attributes and behaviors.
String colour;
String make;
Boolean cheap;
String model;
int size;
 void call() {
	 System.out.println("calls");
 }
void records() {
	System.out.println("recording time long");
}
void takepicture() {
	System.out.println("Take good pictures");
}
	 public static void main(String[] args) {
Pphone iPhone=new Pphone();
	iPhone.make="Iphone";
	iPhone.colour="Black";
	iPhone.cheap=false;
	iPhone.model="Iphone14";
	iPhone.size=257;
	System.out.println("My "+iPhone.make+"is "+iPhone.colour +"with size"+iPhone.size);
	iPhone.call();
	
	
	
	Pphone samsung=new Pphone();
	samsung.make="samsung";
	samsung.colour="Black";
	samsung.cheap=false;
	samsung.model="ultra";
	samsung.size=257;
	
	System.out.println("I hate my "+samsung.make+ " phone which is "+samsung.colour);
	
	
	
	 }	
}
