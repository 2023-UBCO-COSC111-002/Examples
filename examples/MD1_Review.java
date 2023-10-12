package examples;

public class MD1_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		//vs	
		int i = 10;									// this is primitive 
		int j = 20;
		
		if (i < j) System.out.println("Ok!");
		
		double k = 10.0;
		
		
		//be careful
		if (i == k) System.out.println("Ok!");
		
		// & vs && 
		// | vs ||
		// ! (not)
		
		boolean a = false, b = true;
		boolean val = !a && b || a;
		System.out.println( a && b || a );
		System.out.println( a || b && a );
		
		i = -1;
		
		//let's do some string comparison!
		String s = "This is a long message!";		//this is an object
		String num1 = "0123";
		String num2 = "123";
		
		//be careful!!
		if (num1 == num2) System.out.println("Equal!");
		
		if (num1.equals(num2)) System.out.println("Equal!");
		
		String DOG = "DOG";
		String dog = "dog";
		
		
		if (dog.equalsIgnoreCase(DOG)) System.out.println("Equal!");
		
		if (dog.compareTo(DOG) == 0) System.out.println("Equal!");
		
		System.out.println(num1.charAt(0));
		
		num1 = "A big fat cat. no really, he was super big";
		
		System.out.println(num1);
		
		System.out.println(num1.substring(6));
		System.out.println(num1);   
		System.out.println(num1.substring(6,8));   //fat or fa
		System.out.println(num1.length());
		//how to get the last character in a string??
		System.out.println(num1.charAt(num1.length()-1));	
		//System.out.println(num1.substring(6,100)); 
		
		System.out.println(num1.substring(6,num1.length()));  //this is sort of pointless :)
		
		String newS = "";
		
		for (int index = num1.length()-1; index >= 0 ; index--)
		{
			System.out.print(num1.charAt(index));
			newS += num1.charAt(index);
		}
		
		System.out.println();
		System.out.println(newS);
		
		for (int index = 0; index < num1.length(); index++)
		{
			System.out.print(num1.charAt(num1.length() - 1 - index));
		}
		
		// "A" vs 'A'   'AA'
		
		if (num1.charAt(0) == 'A') System.out.println("Equal");
		
		
	}

}
