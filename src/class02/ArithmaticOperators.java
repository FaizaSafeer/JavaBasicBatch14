package class02;

public class ArithmaticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//+,-,*,/,%
		int a=90;
		int b=100;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		int c=10;
	    int d=3;
	    int sum=c+d;
	    int sub=c-d;
	    int remainder =c%d;
	    int div=c/d;  //10/3 
	    System.out.println("Div of int= "+ div);
	    System.out.println(remainder);
	    System.out.println(sum);
	    System.out.println(sub);
	    int e =10;
	    int f=5;
	    System.out.println(e/f);//2
	    System.out.println(e%f);//0 --->remainder 
	    
	    double num1=10.0;
	    double num2=3.0;
	    System.out.println("division of double= "+num1/num2);
	    float number1=10.0f;
	    float number2=3.0f;
	    System.out.println("Division of float ="+ number1/number2);
	    System.out.println("remainder example");
	    // remainder % mod operater
	    System.out.println(6%4);
	    System.out.println(10+10/10);//11
	    System.out.println((10+10)/10);//2
	    
	    
	    
	}

}
