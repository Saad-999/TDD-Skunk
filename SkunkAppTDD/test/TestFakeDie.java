import static org.junit.Assert.*;

import org.junit.Test;

public class TestFakeDie
{

	@Test
	public void testDefaultSetOfRolls()
	{
		Rollable d = new FakeDie();
		assertEquals(1,d.getLastRoll());
		d.roll();
		assertEquals(2,d.getLastRoll());
		d.roll();
		assertEquals(3,d.getLastRoll());
		d.roll();
		assertEquals(4,d.getLastRoll());
		d.roll();
		assertEquals(5,d.getLastRoll());
		d.roll();
		assertEquals(6,d.getLastRoll());
		d.roll();
		assertEquals(1,d.getLastRoll());
		d.roll();


	}

}
