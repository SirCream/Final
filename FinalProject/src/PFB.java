import java.util.*;
public class PFB 
{
	private static int answer;
	private static ArrayList <Integer> digits;
	private static int guessCount;
	
	public static void main (String[] args)
	{
		start();
	}
	
	public static void start()
	{
		int x = 1;
		Scanner keyboard = new Scanner (System.in);
		answer = 1 + (int)(Math.random() * 999);
		int goal = answer;
		digits = new ArrayList <Integer>();
		while (goal > 0)
		{
			digits.add(0, goal % 10);
			goal /= 10;
		}
		guessCount = 0;
		System.out.println(answer);
		
		while (x == 1)
		{
			int pfb = keyboard.nextInt();
			if ((guess(pfb).equals("PPP")))
				x = 0;
		}
		keyboard.close();
	}
	
	public static String guess(int a)
	{
		guessCount ++;
		if (a == answer)
			System.out.println("Congratulations! You guessed it!" + '\n' + "You took " + guessCount + " guesses.");
		String ans = "";
		ArrayList <Integer> guessed = new ArrayList <Integer>();
		ArrayList <Integer> goaldigits = digits;
		while (a > 0)
		{
			guessed.add(0, a % 10);
			a /= 10;
		}
		for (int i = guessed.size() - 1; i >= 0; i --) // checks for same digit in same position
			if (goaldigits.get(i) == guessed.get(i))
			{
				guessed.remove(i);
				goaldigits.remove(i);
				ans += "P";
			}
		for (int i = guessed.size() - 1; i >= 0; i --) // checks for same digit in different position
			for (int j = guessed.size() - 1; j >= 0; j --)
			if (goaldigits.get(i) == guessed.get(j))
			{
				guessed.remove(j);
				goaldigits.remove(i);
				ans += "F";
			}
		for (int i = guessed.size() - 1; i >= 0; i --) // counts unique digits
		{
			guessed.remove(i);
			ans += "B";
		}
		System.out.println(ans);
		return ans;
	}
}

