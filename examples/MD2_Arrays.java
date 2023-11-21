package examples;

import java.util.Arrays;

public class MD2_Arrays {
	
	//This just won't work becase it is using a for-each
	public static void increaseValue(int[] x, int value)
	{
		//this is a read only type operation
		for (int item : x)
		{ 
			item += value;
		}
	}
	
	public static void reallyIncreaseValue(int[] x, int value)
	{
		//this is a read only type operation
		int idx = 0;
		while(idx < x.length)
		{
			//safe!
			//x[idx++] += value;
			
			x[idx] += value;
			idx++;
			
			//don't use pre-incement here as it will miss the first element
			//and cause an out-of-bounds exception
			//x[++idx] += value;
		}
	}
	
	public static void printValue(int[] s)
	{
		System.out.println("The value is : " + Arrays.toString(s));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {1, 1, 99, -12};
		
		printValue(x);
		increaseValue(x,10);
		printValue(x);
		System.out.println("Round II");
		printValue(x);
		reallyIncreaseValue(x,10);
		printValue(x);

	}

}
