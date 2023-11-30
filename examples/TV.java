package examples;

public class TV {
	private int channel; 
	private int volumeLevel;
	private boolean on;
	private static String brand = "StudentVision 2000!";
	
	private static String testMessage;

	public TV()
	{
		//this.channel = 1;
		this.turnOn();
		this.setChannel(1);		//the order matters for us!		System.out.println(tv);

		this.setVolume(1);
	}
	
	public void turnOn()
	{
		this.on = true;
	}
	
	public void turnOff()
	{
		this.on = false;
	}
	
	public void setChannel(int newChannel)
	{
		if (this.on && (newChannel >= 1) && (newChannel <= 120))
		{
			this.channel = newChannel;
		}
	}
	
	public void setVolume(int newVolumeLevel )
	{
		if (this.on && (newVolumeLevel >= 1) && (newVolumeLevel <= 7))
		{
			this.volumeLevel = newVolumeLevel;
		}
	}
	
	public void channelUp()
	{
		this.channel++;
		if (this.channel > 120) this.channel = 1;
	}
	
	public void channelDown()
	{
		this.channel--;
		if (this.channel < 1) this.channel = 120;
	}
	
	public void volumeUp()
	{
		if (this.volumeLevel < 7) this.volumeLevel++;
	}
	
	public void volumeDown()
	{
		if (this.volumeLevel > 1) this.volumeLevel--;
	}
	
	
	public String toString()
	{
		return ("state(on): " + this.on + "\nvolume: " +this.volumeLevel + "\nchannel#: " + this.channel);
		
	}
	
	public void setTestMessage(String msg)
	{
		testMessage = msg;
	}
	
	public void printTestMessage()
	{
		System.out.println(testMessage);
	}
	
	public static void printBrand()
	{
		System.out.println(brand);  //This won't work because it is accesssing n
		//System.out.println("StudentVision 2000!");
	}
	
	public static void resetTV(TV t)
	{
		t.turnOn();
		t.setChannel(1);
		t.setVolume(7);
	}
}
