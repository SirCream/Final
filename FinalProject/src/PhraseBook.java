import java.util.*;
public class PhraseBook 
{
	private ArrayList <String> words;
	
	public PhraseBook()
	{
		words = new ArrayList <String>();
	}
	
	public void fillPhrases()
	{
		words.add("No, I am your father");
		words.add("Use the force, Luke");
		words.add("It had to be snakes");
		words.add("Mama always said life was like a box of chocolates");
		words.add("I understand you're a man who knows how to get things");
		words.add("Don't talk about Fight Club");
		words.add("Keep the change, ya filthy animal");
		words.add("Say hello to my little friend");
		words.add("Follow the yellow brick road");
		words.add("You want to know how I got these scars?");
		words.add("To infinity and beyond");
		words.add("Just keep swimming");
		words.add("It's just a flesh wound");
		words.add("Tina, you fat lard");
		words.add("I just can't wait to be king");
		words.add("If you build it, he will come");
		words.add("Frankly my dear, I don't give a damn");
		words.add("Hey, I'm walking here");
		words.add("There's no place like home");
		words.add("You can't handle the truth");
		words.add("You're gonna need a bigger boat");
		words.add("I'll be back");
		words.add("I'm the king of the world");
		words.add("Shaken, not stirred");
		words.add("Here's Johnny");
		words.add("Nobody puts Baby in a corner");
		words.add("I am serious, and don't call me Shirley");
		words.add("I've always depended on the kindness of strangers");
		words.add("Get your stinking paws off me, you damned dirty ape");
		words.add("Here's looking at you, kid");
		words.add("I love the smell of napalm in the morning");
		words.add("I'm gonna make him an offer he can't refuse");
		words.add("Wax on, wax off");
		words.add("Good morning, Vietnam");
		words.add("Go ahead, make my day");
		words.add("Clever girl");
	}
	
	public String getPhrase ()
	{
		return words.get((int)(Math.random() * words.size()));
	}
}
