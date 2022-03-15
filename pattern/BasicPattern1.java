package pattern;
import java.util.Scanner;

public class BasicPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print");
		int n = sc.nextInt();
		int row = 1;

		while(row<=n) {
			int col =1;
			while(col<=n) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}	

	}
}
