import java.util.*;
public class PFB 
{
	private int answer;
	private ArrayList <Integer> digits;
	private int guessCount;

	public PFB ()
	{
		answer = 1 + (int)(Math.random() * 999);
		while (answer > 0)
		{
			digits.add(answer % 10, 0);
			answer /= 10;
		}
		guessCount = 0;
	}
	
	public void main (String[] args)
	{
		start();
	}
	
	public void start()
	{
		int x = 1;
		Scanner keyboard = new Scanner (System.in);
		while (x == 1)
		{
			int pfb = keyboard.nextInt();
			guess(pfb);
			if (guess(pfb).equals("Congratulations! You guessed it!" + '\n' + "You took " + guessCount + " guesses."))
				x = 0;
		}
		keyboard.close();
	}
	
	public  String guess(int a)
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
		for (int i = temp.size() - 1; i >= 0; i --) // checks for same digit in same position
			if (digits.get(i) == temp.get(i))
			{
				temp.remove(i);
				digits.remove(i);
				ans += "P";
			}	
		for (int i = temp.size() - 1; i >= 0; i --) // checks for same digit in different position
			if (digits.get(i) == temp.get(i + 1))
			{
				temp.remove(i + 1);
				digits.remove(i);
				ans += "F";
			}
		for (int i = temp.size() - 1; i >= 0; i --) // counts unique digits
		{
			temp.remove(i);
			ans += "B";
		}
		return ans;
	}
}

