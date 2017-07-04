import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSkunkApp
{
	private SkunkApp game;

	@Before
	public void setUp()
	{
		game = new SkunkApp();
	}
	
	@Test
	public void testGetPlayerInfo()
	{
		game.getPlayerInfo();
		assertEquals(2,game.getNumberOfPlayers());
		assertEquals("Player 1",game.getPlayerName(1));
		assertEquals("Player 2",game.getPlayerName(2));
	}
	
	@Test
	public void canCreateRoll()
	{
		Roll roll = new Roll();
		assertTrue(roll.getLastTotal()<= 12);
		assertTrue(roll.getLastTotal()>=2);
		// comment!
		// Bob doesn't like this!

	}
	
	

}
