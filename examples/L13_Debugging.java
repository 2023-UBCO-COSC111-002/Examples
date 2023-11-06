package examples;

public class L13_Debugging {

	public static int findMax(int x, int y)
	{
		if (x < y)
			return y;
		else
			return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 20;
		
		int max = findMax(i,j);
		System.out.println("The max value between " + i + " and " + j + " is " + max);

	}

}
