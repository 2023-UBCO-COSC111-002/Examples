package examples;

public class Printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 9999;
		System.out.printf("%d\n", x);   // '/n' is the new line!!!
		System.out.printf("%7d\n", x);
		x = 999999999;
		System.out.printf("%7d\n", x);
		
		float y = 14.56f;
		System.out.printf("%8.1f %%\n", y);
		
		String s = "hi, we are almost done!";
		
		System.out.printf("%s\n"+10, s);
		
		System.out.printf("value of x is %d"+x, x);
		

	}

}
