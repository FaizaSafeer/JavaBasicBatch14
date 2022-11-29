package class09;

public class clastask2 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. Then print your name from that array.
		//(use 2 different ways of creating an array).
String []group=new String[4];
group[0]="Faiza";
group[1]="Bilal";
group[2]="hamza";
group[3]="Yousuf";
System.out.println(group[0]);

System.out.println("_______");
String []groups= {"Faiza","Bilal","hamza","Yousuf"};
int size=groups.length;
System.out.println(size);
System.out.println(group[0]);
	}

}
