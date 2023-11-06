package examples;

public class L15_MoreArrrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[10];
		int[] b = new int[2];

		for (int i = 0; i < a.length; i++)
			a[i] = a.length - i;
		
		for (int i = 0; i < b.length; i++)
			b[i] = b.length - i;
		
		System.out.println("A");
		for (int item: a)
			System.out.println(item);
		
		System.out.println("B");
		for (int item: b)
			System.out.println(item);
		
		//This should print out the obj ref
		System.out.println("A " + a);
		System.out.println("B " + b);
		
		a = b;
		
		System.out.println("A " + a);
		System.out.println("B " + b);
		
		System.out.println("A again");
		for (int item: a)
			System.out.println(item);
		
		System.out.println("B again");
		for (int item: b)
			System.out.println(item);
		
		//what happens here?
		a[1] = 100;
		
		System.out.println("A again");
		for (int item: a)
			System.out.println(item);
		
		System.out.println("B again");
		for (int item: b)
			System.out.println(item);
		
		int[] c = a;
		
		System.out.println("C");
		for (int item: c)
			System.out.println(item);
		
		
		

	}

}
