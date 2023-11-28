package examples;

public class testCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow bessy = new Cow();
		System.out.println(bessy);
		
		//using our 2-arg constructor
		Cow bart = new Cow("Bart",20);
		bart.say("Don't have a cow!");
		bart.eat(10);
		//System.out.println( bart.stomach);
		
		bessy = bart;
		bart = null;
		//at this point, the GC will eventually get run
		System.out.println(bart);
		System.out.println(bessy.nickname);
		bessy.say("hello");
		
		//You can't access stomach now as the visibility modifier has been changed!
		//bessy.stomach = -100;
	


		
	}

}
