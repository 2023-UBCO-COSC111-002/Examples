package examples;

public class Remote {

	private TV t;
	
//	public Remote()
//	{
//		
//	}
	public Remote(TV t)
	{
		this.t = t;
	}
	
	public void on()
	{
		t.turnOn();
	}
	
	public void off()
	{
		t.turnOff();
	}
	
//	public void on(TV t)
//	{
//		t.turnOn();
//	}
//	
//	public void off(TV t)
//	{
//		t.turnOff();
//	}
}
