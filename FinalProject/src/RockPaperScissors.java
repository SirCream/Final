import java.util.*;

public class RockPaperScissors {
	public static void main(String args[]){
		
		Scanner k = new Scanner(System.in); //keyboard declaration k
		
		int PlayAgain = 1;
		
		while(PlayAgain == 1){
			
			int x = (int)(Math.random()*2); 	//Computers game decision
		
		
			int Rock = 0;
			int Paper = 1;
			int Scissors = 2;
			
			System.out.println("Welcome to Rock-Paper-Scissors:" + "\n"+
									"For Rock enter 0," + "\n"+
										"For Paper enter 1," + "\n"+
											"For Scissors enter 2"+"\n");	//Opening line to introduce user to game.
		
			
			int ans = k.nextInt();
		
			if (ans == 0){ 		//if the user chooses Rock
			
				PlayAgain = 0;	//if the input is within the correct range set play again to 0 
				
				if(x == 0){			//User: Rock vs. Comp: Rock
					System.out.println("There is a tie!");
				}
				
				if(x == 1){			//User: Rock vs. Comp: Paper
					System.out.println("You lose!");
				}
				
				if(x == 2){			//User: Rock vs. Comp: Scissors
					System.out.println("You win!");
				}
				
			}
			
	
			if (ans == 1){		//if the user chooses Paper
				
				PlayAgain = 0; //REF Line 29
				
				if(x == 0){			//User: Paper vs. Comp: Rock
					System.out.println("You win!");
				}
				
				if(x == 1){			//User: Paper vs. Comp: Paper
					System.out.println("There is a tie!");
				}
				
				if(x == 2){			//User: Paper vs. Comp: Scissors
					System.out.println("You lose!");
				}
			}
			
			
	
			if (ans == 2){		//if the user chooses Scissors
				
				PlayAgain = 0;	//REF line 29
				
				if(x == 0){			//User: Scissors vs. Comp: Rock
					System.out.println("You lose!");
				}
				
				if(x == 1){			//User: Scissors vs. Comp: Paper
					System.out.println("You win!");
				}
				
				if(x == 2){			//User: Scissors vs. Comp: Scissors
					System.out.println("There is a tie!");
				}
			}
			
			else if(ans != 0 || ans != 1 || ans != 2){
				System.out.println("Invalid input. Try again");
				break;
			}
			
			System.out.println("Play again? (y/n)");
			
			String again = k.next();
			
			if(again.equals("y") || again.equals("Y")){
				PlayAgain = 1;
			}
		}
	}
}
