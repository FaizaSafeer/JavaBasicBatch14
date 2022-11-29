package class03;

public class CastingVar {
	
	public static void main(String[] args) {
		short box=167;
		byte box2=(byte)box;
		System.out.println(box2);
/*y should i learn abt type casting?
*so that we can use the code that is written by someone else
*to make our life easier or when we will be working in teams
*we will be able to merge codes
*what is syntax for type casting?
*when we are converting something smaller to larger we dont need
*to do anything it happens automatically we just assign variable
*int box=123;
*long box2=box//this is how it works and it is called
*implicit or widening or automatic
*
*however when we convert a larger data type to a smaller data 
*type then we 
*long box=1232434
*int box2=(int)box; narowing or explicit or manual conversion
*
*/
		short box3=167;
		byte box4=(byte)box3;
		System.out.println(box4);
		

	}

}
