package examples;

public class L17_nD_Arrays {
	
	
		
	public static void main(String[] args){
		int [][] arr = {
				{1,2,3,4},
				{5,6,7},
				{9,42,1023,999,5}
		};
		
//		int [][] arr = {
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,42,1023,999}
//		};
		
		System.out.println("Rows: " + arr.length);
		
		//this won't work for ragged arrays
//		for(int row = 0; row < 3; row++)
//		{
//			for (int col = 0; col < 4; col++)
//			{
//				System.out.print(arr[row][col] + " ");
//			}
//			System.out.println();
//		}
		
		for(int row = 0; row < arr.length; row++)
		{
			for (int col = 0; col < arr[row].length; col++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		
		int [][] arr2 = new int[3][];
		
		arr2[0] = new int[3];
		arr2[1] = new int[4];
		arr2[2] = new int[1];
		
		//here we can modify the data!
		for(int row = 0; row < arr2.length; row++)
		{
			for (int col = 0; col < arr2[row].length; col++)
			{
				arr2[row][col] = (int)(Math.random()*1001);
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}
		
		//this is a read only 
		for(int row = 0; row < arr2.length; row++)
		{
			for (int val : arr2[row])
			{
				System.out.print(val + " ");
				val = (int)(Math.random()*1001);

			}
			System.out.println();
		}
		
		//this is a read only 
		for(int row = 0; row < arr2.length; row++)
		{
			for (int val : arr2[row])
			{
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
		//Let's find the sum of all the locations
		int sum = 0;  //make sure to declare this variable
						//outside of our nested for loop
						//as we have be able to print out the value	

		for(int row = 0; row < arr2.length; row++)
		{
			for (int val : arr2[row])
			{
				System.out.print(val + " ");
				sum+= val;
			}
			System.out.println();
		}
		
		System.out.println("The sum is ..." + sum);
		
		
	}
}
