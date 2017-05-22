import java.util.*;

public class RockPaperScissors 
{
	public static void main (String[] args)
	{
		start();
	}
	
	public static void start()
	{
		
		Scanner k = new Scanner(System.in); //keyboard declaration k
		
		int PlayAgain = 1;
		int wins = 0;
		int losses = 0;
		int ties = 0;
		System.out.println("Welcome to Rock-Paper-Scissors!");
		while(PlayAgain == 1)
		{
			int x = 3 - (1 + (int)(Math.random() * 3)); 	//Computers game decision
			System.out.print("Cast your move or \"quit\" to quit: ");
			String ans = k.nextLine();
			
			if (ans.equalsIgnoreCase("rock"))
			{ 		
			
				if(x == 0)			//User: Rock vs. Comp: Rock
				{
					System.out.println("There is a tie.");
					ties ++;
				}
				
				if(x == 1)			//User: Rock vs. Comp: Paper
				{
					System.out.println("You lose...");
					losses ++;
				}
				
				if(x == 2)			//User: Rock vs. Comp: Scissors
				{
					System.out.println("You win!");
					wins ++;
				}
			}
	
			if (ans.equalsIgnoreCase("paper"))
			{		
				
				if(x == 0)		//User: Paper vs. Comp: Rock
				{
					System.out.println("You win!");
					wins ++;
				}
				
				if(x == 1)		//User: Paper vs. Comp: Paper
				{
					System.out.println("There is a tie.");
					ties ++;
				}
				
				if(x == 2)		//User: Paper vs. Comp: Scissors
				{
					System.out.println("You lose...");
					losses ++;
				}
			}
			
			if (ans.equalsIgnoreCase("scissors"))
			{		
				
				if(x == 0)			//User: Scissors vs. Comp: Rock
				{
					System.out.println("You lose...");
					losses ++;
				}
				
				if(x == 1)			//User: Scissors vs. Comp: Paper
				{
					System.out.println("You win!");
					wins ++;
				}
				
				if(x == 2)			//User: Scissors vs. Comp: Scissors
				{
					System.out.println("There is a tie.");
					ties ++;
				}
			}
			
			if(ans.equalsIgnoreCase("quit"))
			{
					PlayAgain = 0;
					System.out.println("Record: " + wins + " - " + losses + " - " + ties);
			}
		}
	}
}