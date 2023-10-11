package examples;

import java.util.Scanner;

public class L08_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		int value = 0;
		do
		{
			System.out.println("Enter number (0 to end)");
			value = in.nextInt();
			sum += value;
		}while(value != 0 );
		
		System.out.println("The sum is " + sum);
				
	}

}
