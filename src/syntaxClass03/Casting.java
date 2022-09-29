package syntaxClass03;

public class Casting {

	public static void main(String[] args) {
/*type casting-->type+data type casting=converting
 *converting one data typeto another
 */
byte box1=127;//smallest box
short box2=3333;//slightly large box
int box3=32434566;//largestbox mostlu used
long box4=324325445;//slighty large box
 float box5=34545567;//larger box
double box6=435456479;//largest


int	number=(int)15.2;
// we cant store decimal no. in a box of type int
	System.out.println(number);	
byte smallerBox=(byte)box2;	
System.out.println(smallerBox);

short biggerBox=box1;
System.out.println(biggerBox);
long box7=box1;//can do this cozbox7 is larger thn box1
float box8=(float)box6;//as box 6 larger we need to type casting to assign the value
char a=(char)66;	
	System.out.println(a);	
	int box9=(int)box4;	
System.out.println(box9);
	}

}
