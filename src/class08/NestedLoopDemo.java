package class08;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// car
for (int i =1; i<3;i++) {// outer loop
	System.out.println("Hello");
	for(int j=1 ; j<=3; j++) {//inner loops depends om outer loop
		System.out.println("Bye");		
	}
}

System.out.println("_____________");

for (int i=0; i<=2;i++) {
	for (int j =1; j<4;j++) {
		System.out.println(i+" "+j);
	}
}

// multiplication table
for (int i=1; i<=9; i++) {
	for ( int j =1;j<+9; j++) {
		System.out.println(i+"X"+j+"="+i*j);
	}
	System.out.println("_______________");

}

	}

}
