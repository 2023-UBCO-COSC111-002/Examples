package examples;

public class L09_For_Loops {

	public static void main(String[] args) {

		
		//int i; 
//		for(int i = 0; i < 10; i+=2)
//		{
//			System.out.print("Hi!");
//			System.out.println(" There!");
//			 ///   i+=11;  //be careful!!!!
//		}
//		for(int i = 0; i != 10; i+=2)
//		{
//			System.out.print("Hi!");
//			System.out.println(" There!");
//			 ///   i+=11;  //be careful!!!!
//		}
		
//		for(int i = 0; i != 10; i+=3)
//		{
//			System.out.print("Hi!");
//			System.out.println(" There!");
//			 ///   i+=11;  //be careful!!!!
//		}
//		int i = 0;
//		for( ; i < 10 ; i++)
//		{
//			System.out.print("Hi!");
//			System.out.println(" There!");
//			//i+=1;  //be careful!!!!
//		}
		
		
//		//danger!!
//		int i = 0;
//		int j = 0;
//		for( ; j < 10 ; i++)
//		{
//			System.out.print("Hi!");
//			System.out.println(" There!");
//			//i+=1;  //be careful!!!!'
//			j = i;
//		}
		
		//danger!!
//		int i = 0;
//		int j = 0;
//		for( ; j < 10 ; j=i, i++)
//		{
//			System.out.print("Hi!");
//			System.out.println(" There!");
//			//i+=1;  //be careful!!!!'
//			//j = i;
//			System.out.println(j);
//		}
		
//		int i = 0;
//		int j = 0;
//		for( ; j < 10 ; j=i, ++i)
//		{
//			System.out.print("Hi!");
//			System.out.println(" There!");
//			//i+=1;  //be careful!!!!'
//			//j = i;
//			System.out.println(j);
//		}
		
		int j = 0;
		int i = 0;
		double z = 0.0;
		for( ; i < 2 ; i++)
		{
			
			for ( j = 0, z = 2.0 ; j < 2 ; j++)
			{
				int k = i;
				System.out.print("Hi!");
				System.out.println(" There!");
				System.out.println("i = " + i + " j = "+j);
			}
			

		}
	}

}
