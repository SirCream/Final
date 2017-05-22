import java.util.*;
public class PFB 
{
	private static ArrayList <Integer> digits;
	private static int guessCount;
	
	public static void main (String[] args)
	{
		start();
	}
	
	public static void start()
	{
		int x = 1;
		System.out.print("Guess the 3 digit number: ");
		Scanner keyboard = new Scanner (System.in);
		digits = new ArrayList <Integer>();
		for (int j = 0; j < 3; j++)
			if (j == 0)
			{
				int digit = 10 - (1 + (int)(Math.random() * 9));
				digits.add(digit);
			}
			else
			{
				int digit = 10 - (1 + (int)(Math.random() * 10));
				while (digits.contains(digit))
					digit = 10 - (1 + (int)(Math.random() * 10));
				digits.add(digit);
			}
		guessCount = 0;
		while (x == 1)
		{
			int pfb = keyboard.nextInt();
			if ((guess(pfb).equals("win")))
				x = 0;
		}
		keyboard.close();
	}
	
	public static String guess(int a)
	{
		guessCount ++;
		String ans = "";
		ArrayList <Integer> guessed = new ArrayList <Integer>();
		while (a > 0)
		{
			guessed.add(0, a % 10); //creates digit list of guess
			a /= 10;
		}
		if (guessed.equals(digits)) //checks for correct guess
		{
			System.out.println("Congratulations! You guessed it!" + '\n' + "You took " + guessCount + " guesses.");
			return "win";
		}
		else
			for (int i = 0; i < 3; i ++) // checks for same digit in same position
				if (guessed.get(i) == digits.get(i))
					ans += "P";
			for (int i = 0; i < 3; i ++) // checks for same digit in different position
				if (i == 0)
				{
					for (int j = 1; j < 3; j ++) //when i = 0, checks against digits[1] and digits[2]
						if (guessed.get(i) == digits.get(j))
							ans += "F";
				}
				else if (i == 1)
				{
					for (int j = 0; j < 3; j += 2) //when i = 1, checks against digits[0] and digits[2]
						if (guessed.get(i) == digits.get(j))
							ans += "F";
				}
				else if (i == 2)
				{
					for (int j = 0; j < 2; j ++) //when i = 2, checks against digits[0] and digits[1]
						if (guessed.get(i) == digits.get(j))
							ans += "F";
				}
			for (int i = 0; i < 3; i ++) // counts unique digits
				if (!(digits.contains(guessed.get(i))))
					ans += "B";
			System.out.println(ans);
		return ans;
	}
}

