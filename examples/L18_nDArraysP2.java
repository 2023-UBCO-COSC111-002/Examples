package examples;

public class L18_nDArraysP2 {

	public static int[][] createArray(int numRows, int numCols, int max)
	{
		int[][] arr = new int[numRows][numCols];
		
		for (int row = 0; row < arr.length;row++)
		{
			for (int col = 0; col < arr[row].length;col++)
			{
				arr[row][col] = (int)(Math.random()*(max+1));
			}
		}
		
		return arr;

	}
	
	public static void addTwo(int[][] arr)
	{
		for (int row = 0; row < arr.length;row++)
		{
			for (int col = 0; col < arr[row].length;col++)
			{
				arr[row][col]+=2;
			}
		}

	}
	
	public static void printArray(int[][] arr)
	{
		for (int row = 0; row < arr.length;row++)
		{
			for (int col = 0; col < arr[row].length;col++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void printArrayv2(int[][] arr)
	{
		for (int[] row : arr)
		{
			for (int col: row)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] switchaRoo(int[][] arr)
	{
		int[][] localArray = arr;
		
		localArray = new int[10][10];
		
		localArray[1][1] = 42;
		
		return localArray;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = createArray(5,6,10);
		printArray(array);
		System.out.println();
		
		//will this actually modify the original array?  - Yes!
		addTwo(array);
		printArray(array);
		
		printArray(switchaRoo(array));
		
		System.out.println();
		printArray(array);

		System.out.println();
		printArrayv2(array);

		
		
	}

}
