package examples;

import java.util.Arrays;

public class L16_Practice {

	//fill an array with random values! - Method 1
	public static void makeRandomValues(int[] arr,int min, int max, int numberOfValues)
	{
		for (int idx = 0; idx < numberOfValues; idx++)
			arr[idx] = min + (int)(Math.random()*(max-min+1));
	}
	
	//overloaded version - Method 2
	public static void makeRandomValues(int[] arr,int min, int max)
	{
		for (int idx = 0; idx < arr.length; idx++)
			arr[idx] = min + (int)(Math.random()*(max-min+1));
	}

	//overloaded version - Method 3
	public static void makeRandomValues(int[] arr,double min, double max)
	{
		for (int idx = 0; idx < arr.length; idx++)
			arr[idx] = (int)min + (int)(Math.random()*(max-min+1));
	}
	
	//overloaded version - Method 4
	public static int[] makeRandomValues(int min, int max, int size)
	{
		int[] arr = new int[size];
		
		for (int idx = 0; idx < arr.length; idx++)
			arr[idx] = (int)min + (int)(Math.random()*(max-min+1));
		
		return arr;
	}
		
	
	public static void printArr(int[] arr)
	{
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 8;
		int[] x = new int[size];
		int[] y = new int[20];
		printArr(x);
		makeRandomValues(x,0,100,size);  //match method 1
		printArr(x);
		
		printArr(y);
		makeRandomValues(y,0,100);		//match method 2
		printArr(y);
		System.out.println(y);			//print obj ref
		
		printArr(y);
		makeRandomValues(y,0,100.0);		//match method 
		printArr(y);
		System.out.println(y);			//print obj ref
		
		int[] z = null;
		System.out.println(z);
		z = makeRandomValues(0,100,10);		
		printArr(z);
		System.out.println(z);
		z = makeRandomValues(0,100,10);	
		printArr(z);
		System.out.println(z);
		System.out.println("After sort!!");
		Arrays.sort(z);
		printArr(z);
		System.out.println(z);

	}

}
