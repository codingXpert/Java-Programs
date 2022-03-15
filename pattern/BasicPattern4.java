package pattern;

import java.util.Scanner;

public class BasicPattern4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter number of rows you want to print");
	    int n = sc.nextInt();
	    
	    int row = 1;
	    while(row<=n) {
	    	int col = 1;
	    	while(col<=n) {
	    		System.out.print(n-col+1);
	    		col++;
	    		
	    	}
	    	
	    	System.out.println();
	    	row++;
	    }

	}

}
