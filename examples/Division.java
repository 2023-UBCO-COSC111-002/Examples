package examples;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 15;
		int j = 2;
		System.out.println(i/j);
		
	
		
		System.out.println(5/2);     	// int/int --> int
		
		System.out.println(5.0/2);		// double/t --> double

		System.out.println(5/2.0);		// int/double --> ??? -->  double

		double x = 5/2;					// int/int --> int; it is then assgned to x
		
		System.out.println(x);
		
		double y = 1.0/5 * 3 + 22.5;
		
		//char c = 26757575 + 3;
		
		System.out.println(y);
		
		int result = (int)(Math.pow(2.5, 2));  //6.25  --> 6
		
		System.out.println(result);
		
		result = (int)(Math.pow(4, 1/2));  //2
		
		System.out.println(result);
		
		int k = 10;
		k++;			// this is all good (k = k + 1 and k += 1)
		//at this point,  k is 11
		System.out.println(k+1);  /// in this case, the original value of k is unchanged!!!!!!!1
		
		
		
		
	}

}
