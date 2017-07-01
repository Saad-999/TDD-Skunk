
public class SkunkApp
{

	private int numberOfPlayers;
	private String[] playerNames = new String[2];

	public void getPlayerInfo()
	{
		numberOfPlayers = 2;
		playerNames= new String[numberOfPlayers];
		
		playerNames[0] = "Player 1";
		playerNames[1] = "Player 2";
		
	}
	
	public static void main(String[] args)
	{
		
	}

	public int getNumberOfPlayers()
	{
		return numberOfPlayers;
	}

	public String getPlayerName(int playerNumber)
	{	
		return playerNames[playerNumber-1];
	}


}
