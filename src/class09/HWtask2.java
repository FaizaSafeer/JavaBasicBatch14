package class09;

public class HWtask2 {

	public static void main(String[] args) {
//  Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
	String []animals= {"cat","dog","tiger","lion","chick"};
	for (String animal:animals) {
		System.out.print(animal+" ");
	}
	System.out.println("another method");
	
	for (int i =0; i<animals.length; i++) {
		System.out.println(animals[i]);
	}

	}

}
