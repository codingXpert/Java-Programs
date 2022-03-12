package basicProgram;
import java.util.Scanner;

public class FindCharacterCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);
		int cast = ch;
		if(cast>=65 && cast<=91) {
			System.out.println("1");
		}
		else if(cast>=97 && cast<=122) {
			System.out.println("0");
		}
		else {
          System.out.println("-1");
		}
	}

}
