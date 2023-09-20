package examples;
import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		double userInput = input.nextDouble();
		System.out.println("Your number is " +  userInput);
		//Gotcha!!!! Watch out for this
		//input.nextLine();
		//input.nextDouble();
		System.out.println("Enter your dog's name:");
//		String dogName = input.next();
		String dogName = input.nextLine();
		System.out.println(dogName + " is a good dog!");
	}

}
