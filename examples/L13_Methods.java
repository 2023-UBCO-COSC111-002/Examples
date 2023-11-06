package examples;

public class L13_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(m(1,2));
//		System.out.println(m(1.0,2));
//		System.out.println(m(1,2.0));
		
		//m('a');

		int j = 10;  //j is declared outside of the block 
		
		for (int i = 0; i< 10; i++)
		{
			//j = 10;
			System.out.println(j);
			j++;
		}
	}
	
//	public static void m(int x)
//	{
//		System.out.println("A: " + x);
//	}
	
//	public static void m(double x)
//	{
//		System.out.println("B: " + x);
//	}
//	
	public static void m(String x)
	{
		System.out.println("C: " + x);
	}
	public static  double m(double x, double y)
	{
		return 1;
	}
	
	public static  double m(int x, double y)
	{
		return 0;
	}
	
	public static  double m(int x, int y)
	{
		return 0;
	}

}
