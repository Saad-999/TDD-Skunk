import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFakeDie
{
	private Rollable defaultDie;
	private Rollable presetDie;
	private Rollable empty;
	
	@Before
	public void setup()
	{
		defaultDie = new FakeDie();
		presetDie = new FakeDie(new int[] {3});
		empty = new FakeDie(new int[0]); // no data? return 1
	}
	
	@Test
	public void testDefaultSetOfRolls()
	{
		assertEquals(1,defaultDie.getLastRoll());
		defaultDie.roll();
		assertEquals(2,defaultDie.getLastRoll());
		defaultDie.roll();
		assertEquals(3,defaultDie.getLastRoll());
		defaultDie.roll();
		assertEquals(4,defaultDie.getLastRoll());
		defaultDie.roll();
		assertEquals(5,defaultDie.getLastRoll());
		defaultDie.roll();
		assertEquals(6,defaultDie.getLastRoll());
		defaultDie.roll();
		assertEquals(1,defaultDie.getLastRoll());
		defaultDie.roll();
	}
	
	@Test
	public void testFixedSetOfRolls()
	{
		assertEquals(3,presetDie.getLastRoll());
		for (int times=0; times < 1000; times++)
		{
			presetDie.roll();
			assertEquals(3,presetDie.getLastRoll());
		}
	}

	@Test
	public void testEmptySetOfRolls()
	{
		assertEquals(1,empty.getLastRoll());
	}
}
