package examples;

public class Chars {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
		{
			char c = (char)(65 + (int)(Math.random()*26));
			System.out.println(c);	
		}
		
		char c = '5';
		int x = c - '0';
		System.out.println(x+2);
		
		
	}

}
