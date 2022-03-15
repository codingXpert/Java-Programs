package pattern;

import java.util.Scanner;

public class TrangularPattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter number of rows you want to print");
	    int n = sc.nextInt();
	    
	    int row = 1;
	    int p = 1;
	    while(row<=n) {
	    	int col = 1;
	    	while(col<=row) {
	    		System.out.print(p);
	    		col++;
	    		p++;
	    		
	    	}
	    	
	    	System.out.println();
	    	row++;
	    }


	}

}
