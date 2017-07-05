import static org.junit.Assert.*;

import org.junit.Test;

public class TestDie
{

	@Test
	public void rangeOfLastRoll()
	{
		Die d = new Die();
		
		for (int i=0; i < 1000; i++)
		{
			d.roll();
			assertTrue(d.getLastRoll() >= 1 && d.getLastRoll() <= 6);
		}
	}

}
