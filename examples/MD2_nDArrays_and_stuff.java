package examples;

public class MD2_nDArrays_and_stuff {

	
	public static String reverso(String s)
	{
		String newStr = "";
		
		for (int idx = s.length()-1 ; idx >= 0; idx --)
		{
			newStr += s.charAt(idx);
		}
		return newStr;
		
	}
	
	public static void main(String[] args) {

		String s = "This is a string!";
		String newStr = "";
		
		for (int idx = 0; idx < s.length(); idx ++)
		{
			System.out.println(s.charAt(idx));
		}
		
		for (int idx = s.length()-1 ; idx >= 0; idx --)
		{
			System.out.println(s.charAt(idx));
			newStr += s.charAt(idx);
		}
		
		System.out.println(newStr);
		
		int x = 123456789;
		
		String xStr = "" + x;
		
		xStr = reverso(xStr);

		
		//this is some extra stuff that we will talk about next term!
		x = Integer.valueOf(xStr);
		
		System.out.println(x);
		
		int[][] arr = { {1,2,3}, {4,5,6}};
		
		System.out.println(arr.length);   //this will print out the number of rows
		
		for (int row = 0; row < arr.length; row ++)
		{
			for (int col = 0; col < arr[row].length; col ++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		
		// and now with a for-each
		for (int row[] : arr)  //watch out!  this is a gotcha
		{
			for (int col : row)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		
	}

}
