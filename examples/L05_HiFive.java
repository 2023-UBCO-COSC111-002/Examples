package examples;
import java.util.Scanner;

public class L05_HiFive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number!!!");
		int i = in.nextInt();
		if ( i % 5 == 0 ) {
			System.out.println("HiFive");

		}
		if (i % 2 == 0){
			System.out.println("HiEven");
		}
	}

}
