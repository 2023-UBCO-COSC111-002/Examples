package examples;

public class MD2_Review {
	
//	public static int findSum(int[] receivedArray)
//	{
//		int sum = 0;
//		
//		for (int idx = 0; idx < receivedArray.length; idx ++)
//		{
//			sum += receivedArray[idx];
//		}
//		return sum;
//	}
	
	/**
	 * This method, while it appears to increase the value of 
	 * x, it only increases it within the method; the original 
	 * value from outside the method is unchanged as it is a 
	 * primitive
	 * 
	 */
	public static void increaseValue(int x, int value)
	{
		x = x + value;
		System.out.println("This is inside the method 'increaseValue'");
		printSum(x);
	}
	
	public static int reallyIncreaseValue(int x, int value)
	{
		x = x + value;
		System.out.println("This is inside the method 'increaseValue'");
		printSum(x);
		return x;
	}
	
	public static int findSum(int[] receivedArray)
	{
		int sum = 0;
		
		//now with for-each
		for (int item : receivedArray)
		{
			sum += item;
		}
		return sum;
	}
	
	public static void printSum(int s)
	{
		System.out.println("The sum is : " + s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 67, 7, -2, 007};
		
		int sum = findSum(arr);
		printSum(sum);
		increaseValue(sum, 100);
		printSum(sum);
		
		printSum(sum);
		sum = reallyIncreaseValue(sum, 100);
		printSum(sum);
	}

}
