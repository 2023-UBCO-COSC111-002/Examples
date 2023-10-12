package examples;

public class L08_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;		//remember to initialize!!
		
		while(count < 10)		
		{
			System.out.print("*");
			count ++;
		}
		System.out.println();
		
		count = 1;		//remember to initialize!!
		
		while(count <= 10)		
		{
			System.out.print(count + " ");
			count ++;
		}
		
		System.out.println();
		count = 0;		//remember to initialize!!
		
		while(count < 10)		
		{	
			count ++;
			System.out.print(count + " ");
		
		}
		
		System.out.println();
		
		count = 0;		//remember to initialize!!
		
		while(count < 10)		
		{	
			System.out.print(++count + " ");
		
		}
		
		System.out.println();
		
		count = 10;		//remember to initialize!!
		
		while(count > 0)		
		{	
			System.out.print(count + " ");
			count--;
		
		}
		
System.out.println();
		
		count = 10;		//remember to initialize!!
		
		while(count > 0)		
		{	
			System.out.print(count-- + " ");
		
		}

		//Print out even numbers!!
		System.out.println();
		count = 0;		//remember to initialize!!
		
		while(count < 10)		
		{	
			count += 2;
			System.out.print(count + " ");
		
		}
		
		//Print out even numbers!!
		System.out.println();
		count = 1;		//remember to initialize!!
		
		while(count < 10)		
		{	
			count ++;
			if (count%2 == 0) 
			{
				System.out.print(count + " ");
			}
		
		}
		
		//Print out even numbers!!
		System.out.println();
		count = 1;		//remember to initialize!!
		
		while(count < 10)		
		{	
			System.out.print(count + " ");
			count += 2;
		
		}
		
		System.out.println();
		count = 1;		//remember to initialize!!
		
		while(count < 10);		
		{	
		
			if (count%2 != 0)  //or == 1
			{
				System.out.print(count + " ");
			}
			count ++;
		
		}
		
		boolean stop = false;
		while(!stop)
		{
			//some big program...
		}
		
		//
	}
	
	

}
