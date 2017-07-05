import java.util.ArrayList;
import java.util.Arrays;

public class FakeDie extends Rollable
{
	private ArrayList<Integer> fakeRolls;
	private int indexOfNextValue;

	public FakeDie()
	{
		this(new int[]
		{ 1, 2, 3, 4, 5, 6 });
	}

	public FakeDie(int[] it)
	{

		fakeRolls = new ArrayList<Integer>();
		for (int i : it)
			fakeRolls.add(i);
		if (it.length==0)
			fakeRolls.add(1);
	}

	public void roll()
	{
		indexOfNextValue++;
		
		if (indexOfNextValue >= fakeRolls.size())
		{
			indexOfNextValue = 0;
		}

	}
	
	public int getLastRoll()
	{
		return fakeRolls.get(indexOfNextValue);
		
	}
}
