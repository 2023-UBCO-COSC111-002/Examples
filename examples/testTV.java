package examples;

public class testTV {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		TV tv2 = new TV();
		
		Remote r = new Remote(tv);
		Remote r2 = new Remote(tv2);
		
		System.out.println(tv);
		System.out.println(tv2);
		
		tv.channelUp();
		tv.volumeUp();

		System.out.println(tv);
		System.out.println(tv2);
		
		System.out.println("Turing off.....");
		r.off();
		System.out.println(tv);
		System.out.println(tv2);
		
		r2.off();
		System.out.println(tv);
		System.out.println(tv2);
		
		System.out.println("\nTest Messages.....\n");

		tv.printTestMessage();
		tv2.printTestMessage();
		
		System.out.println("\nSet Test Messages.....\n");

		tv.setTestMessage("Potatoe!");
		
		System.out.println("\nPrinting Updated Test Messages.....\n");
		
		tv.printTestMessage();
		tv2.printTestMessage();
		TV.printBrand();
		
		TV.resetTV(tv);
		System.out.println(tv);

		
		
	}

}
