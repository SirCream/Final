import java.util.*;
public class PFB 
{
	private int answer;
	private ArrayList <Integer> digits;
	private int guessCount;
	private int pos;

	public PFB ()
	{
		answer = 1 + (int)(Math.random() * 999);
		while (answer > 0)
		{
			digits.add(answer % 10, 0);
			answer /= 10;
		}
		guessCount = 0;
		pos = digits.size() - 1;
	}
	
	public String guess(int a)
	{
		guessCount ++;
		if (a == answer)
			return ("Congratulations! You guessed it!" + '\n' + "You took " + guessCount + " guesses.");
		String ans = "";
		ArrayList <Integer> temp = new ArrayList <Integer>();
		while (a > 0)
		{
			temp.add(a % 10, 0);
			a /= 10;
		}
		for (int i = temp.size() - 1; i >= 0; i --)
			if (digits.get(i) == temp.get(i))
			{
				temp.remove(i);
				digits.remove(i);
				ans += "P";
			}	
		for (int i = temp.size() - 1; i >= 0; i --)
			if (digits.get(i) == temp.get(i + 1))
			{
				temp.remove(i + 1);
				digits.remove(i);
				ans += "F";
			}
		for (int i = temp.size() - 1; i >= 0; i --)
		{
			temp.remove(i);
			ans += "B";
		}
		return ans;
	}
}

