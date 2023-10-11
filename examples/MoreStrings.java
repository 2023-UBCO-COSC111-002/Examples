package examples;

import java.util.Scanner;

public class MoreStrings {

	public static void main(String[] args) {

//		Scanner in = new Scanner(System.in);
//		String s1 = in.nextLine();		//enter abc
//		String s2 = in.nextLine();		//enter abc
		
		
//		String s1 = new String("abc");
//		String s2 = new String("abc"); 
		
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = s1.intern();
		
		
	
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
	}

}
