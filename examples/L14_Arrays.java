package examples;

public class L14_Arrays {

	public static void main(String[] args) {

		
		String[] d;			//this is our object reference to an array
		
		d = new String[10];
		
		for (int idx = 0; idx < d.length; idx ++)
		{
			d[idx] = "";	//init to the empty string
			System.out.println("Index position: " + idx + " contests: " + d[idx]);
			System.out.println("length of this string: " + d[idx].length());
		}
	}

}
