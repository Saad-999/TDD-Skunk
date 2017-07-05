
public class Die extends Rollable

{
	protected int lastRoll;
	
	public Die()
	{
	// this.roll(); // oops: subclassing causes problems if roll() overridden
	}
	
	public void roll()
	{
		this.lastRoll = 1 + (int)Math.random()*6;
	}
	
	public int getLastRoll()
	{
		return lastRoll;
	}

}
