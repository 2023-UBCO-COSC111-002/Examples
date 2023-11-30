package examples;

public class Cow {
	//Instance data
	String nickname;
	private int stomach;
	boolean isFull;
	
	//Return of the no-arg constructor
	public Cow()
	{
		this("Anonymous", 50);		//if you call another constructor, 'this' must be done first!!
		this.stomach = 60;

		//this("Anonymous", 50); //this will cause an issue!
		//this.nickname = "Anonymous";
		
	}
	
	//as soon as you create an constructor that has arguments
	//the no-arg (default) constructor goes away!!!
	public Cow(String name, int stomach)
	{
		//this();
		this.nickname = name;
		this.stomach = stomach;
		this.sayMyName();
	}
	
	
	public void eat(int food)
	{
		stomach += food;
	}
	
	public void say(String something)
	{
		System.out.println(something);
		this.sayMyName();			//private method that can only be called from inside class
	}
	
	private void sayMyName()
	{
		System.out.println(this.nickname);
	}
	
	public void setStomach(int value)
	{
		if (value < 0)
			return;
		else
			stomach +=  value;
		
	}
	
	public int getStomach()
	{
		return this.stomach;
	}
}
