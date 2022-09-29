package comsyntaxclass09;

public class HWtask1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
String[] cars= {"mercedes","BMW","Tesla","Toyota","Alfa romeo","Audi"};
for (String car:cars) {
	System.out.print(car+" ");
}
System.out.println("-----");
 for (int i =0; i<cars.length; i++) {
	 System.out.println(cars[i]);
 }


	}

}
