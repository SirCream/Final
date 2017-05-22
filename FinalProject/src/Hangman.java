import java.util.*;
public class Hangman 
{
	private static String phrase;
	private static String spaces;
	public static void main (String[] args)
	{
		System.out.print(start());
	}
	public static String start()
	{
		Scanner keyboard = new Scanner(System.in);
		PhraseBook phrases = new PhraseBook();
		phrases.fillPhrases();
		phrase = phrases.getPhrase();
		int wrong = 6;
		int count = 0;
		spaces = phrase;
		for (int i = 0; i < spaces.length(); i ++)
			if (spaces.charAt(i) != ' ' && spaces.charAt(i) != ',' && spaces.charAt(i) != '?' && spaces.charAt(i) != '\'')
				spaces = spaces.replace(spaces.charAt(i), '_');
		while (wrong > 0)
		{
			System.out.println(spaces);
			String guess = keyboard.nextLine();
			String temp1 = "";
			String temp2 = "";
			if (guess.length() == 1)
			{
				temp1 = "" + guess.charAt(0);
				for (int j = 0; j < phrase.length(); j ++)
				{
					temp2 = "" + phrase.charAt(j);
					if (temp1.compareToIgnoreCase(temp2) == 0)
					{
						count ++;
						if (j != 0 && j != spaces.length() - 1)
							spaces = spaces.substring(0, j) + temp2 + spaces.substring(j + 1, spaces.length());
						else if  (j == 0)
							spaces = temp2 + spaces.substring(j + 1, spaces.length());
						else if (j == spaces.length() - 1)
							spaces = spaces.substring(0, j) + temp2;
					}
				}
				if (count == 0)
				{
					wrong --;
					System.out.println("You have " + wrong + " wrong guesses remaining.");
				}
				count = 0;
			}
			else
				if (guess.compareToIgnoreCase(phrase) == 0)
					return ("Congratulations! You guessed it!");
				else
				{
					wrong --;
					System.out.println("You have " + wrong + " wrong guesses remaining.");
				}
		}
		return ("Better luck next time. The phrase was: " + phrase);
	}
}

