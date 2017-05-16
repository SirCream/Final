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
		int goal = 1 + (int)(Math.random() * 999);
		digits = new ArrayList <Integer>();
		while (goal > 0)
		{
			digits.add(0, goal % 10);
			goal /= 10;
		}
		guessCount = 0;
		
		while (x == 1)
		{
			int pfb = keyboard.nextInt();
			if (guess(pfb).equals("Congratulations! You guessed it!" + '\n' + "You took " + guessCount + " guesses."))
				x = 0;
		}
		keyboard.close();
	}
	
	public static String guess(int a)
	{
		guessCount ++;
		if (a == answer)
			return ("Congratulations! You guessed it!" + '\n' + "You took " + guessCount + " guesses.");
		String ans = "";
		ArrayList <Integer> temp = new ArrayList <Integer>();
		ArrayList <Integer> temp2 = digits;
		while (a > 0)
		{
			temp.add(0, a % 10);
			a /= 10;
		}
		for(int x: temp2)
			System.out.print(x);
//		for (int i = temp.size() - 1; i >= 0; i --) // checks for same digit in same position
//			if (temp2.get(i) == temp.get(i))
//			{
//				temp.remove(i);
//				temp2.remove(i);
//				ans += "P";
//			}	
//		for (int i = temp.size() - 1; i >= 0; i --) // checks for same digit in different position
//			if (temp2.get(i) == temp.get(i + 1))
//			{
//				temp.remove(i + 1);
//				temp2.remove(i);
//				ans += "F";
//			}
//		for (int i = temp.size() - 1; i >= 0; i --) // counts unique digits
//		{
//			temp.remove(i);
//			ans += "B";
//		}
		return ans;
	}
}

