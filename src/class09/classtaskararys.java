package class09;

public class classtaskararys {

	public static void main(String[] args) {
		//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways 
		//of creating an array).
		char[] grades=new char[4];
		grades[0]='A';
	    grades[1]='B';
	    grades[2]='C';
	    grades[3]='D';
	    System.out.println(grades[1]);
	    
	    
	    System.out.println("other way");
	    
	    char[]grade= {'A','B','C','D'};
	    System.out.println(grade[1]);
	}

}
