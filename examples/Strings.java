package examples;

public class Strings {

	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "Hi";
		
		//This comparing the object reference for s1 and s2
		//and not!!!!! the values of the strings!!!!!!!!!!!
		System.out.println(s1 == s2);   //false
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2));  //true
		
		s1 = "hi this is a long message";
		
		System.out.println(s1.startsWith("hi "));
		
		s1 = "Today is Monday!";
		System.out.println(s1.substring(9));  //the starting value is
												//inclusive!!
		System.out.println(s1.substring(6,7));  //this will exclude 's'
		
		System.out.println(s1.substring(6,8));  //need to extend the last positiion
												//by 1
		
		s1 = "1234";
		System.out.println(Integer.parseInt(s1) + 6);
		
//		s1 = "123 Hi!";				//this is yucky and won't work
//		System.out.println(Integer.parseInt(s1));

		s1 = "123.456";
		System.out.println(Double.parseDouble(s1));
		
		s1 = "123.456";
		System.out.println(Double.parseDouble(s1)+1.5);
	}

}
