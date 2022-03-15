package pattern;
import java.util.Scanner;

public class BasicPattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter number of rows you want to print");
	    int n = sc.nextInt();
	    
	    int row = 1;
	    while(row<=n) {
	    	int col = 1;
	    	while(col<=n) {
	    		System.out.print(row);
	    		col++;
	    	}
	    	System.out.println();
	    	row++;
	    }
	
		

	}

}
