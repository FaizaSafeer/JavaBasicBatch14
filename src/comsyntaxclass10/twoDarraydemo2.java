package comsyntaxclass10;

public class twoDarraydemo2 {

	public static void main(String[] args) {
String[] []countries= {
		{"USA","Canada"},// 1 array with index0
		{"Peru","Brazil","Colimbia","Ecuador"},// 2array with index 1
		{"Ethopia","Egypt","Kenya"},
		{"Germany","Turkey","Maldova","Ukraine"},
		{"Kazakhstan","Afghanistan","Korea"}
};
System.out.println(countries.length);//5 total no of arrays

int elof1arr=countries[0].length;
System.out.println("# of element in 1 array="+elof1arr);
int elof2arr=countries[1].length;
System.out.println("# of element in 2 array="+elof2arr);

System.out.println("getting all values from 2d arrays");

for( int r =0;r<countries.length; r++) {// loops over rows
	for (int c=0; c<countries.length;c++) {
		System.out.print(countries[r][c]+" ");
    }
    System.out.println();
	}
String[][] arr= {

        {"Yusuf", "Hamza", "Adam", "John"},
        {"A", "B", "C", "D"}
};


for(String[] singleArray:arr) { //loops over 1d or single array

    for(String el:singleArray) { //loops over each element of the 1dArray
        System.out.print(el+"  ");
    }

    System.out.println();
}

System.out.println(" ---------------------------- ");


for(int i=0; i<arr.length; i++) {

    for (int j=0; j<arr[i].length; j++) {
        System.out.print(arr[i][j]+"  ");
    }
    System.out.println();
}

}

	}
	


