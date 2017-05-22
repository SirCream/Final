import java.util.*;
public class TicTacToe {
	
	static char[][] table = new char[3][3];
	

	public static void main(String args[]){
		
		TicTacToe game = new TicTacToe(); //creates new TicTacToe object
		
		int PlayAgain = 1;	//variable keeps track of the users desire to play the game again after it is over
		
		Scanner k = new Scanner(System.in); //keyboard declaration
		
		while(PlayAgain == 1){  //while loop for playing again 
			
	        System.out.println("Welcome to Tic-Tac-Toe:"); //welcome statment
	        
			game.table();	//creates new table
			printBoard();	//prints table in the console
			
	        int row;		//int for the inputed row
	        int column;		// ^ column
	        
			while(PlayAgain == 1){   //while loop for each turn
				
				System.out.print("Choose row:");
				row = k.nextInt();
				System.out.print("Choose colum:");
				column = k.nextInt();
				
				
				while (!isEmpty(row,column)){	//checks to makesure that the requested location isnt alreay taken
					System.out.println("That slot is already taken or out of bounds, please try again: ");
					
					printBoard(); 
					
					System.out.print("Choose row:");
					row = k.nextInt();
					System.out.print("Choose colum:");
					column = k.nextInt();
				}
				
					playTurn(row,column); //processes turn
					
					
					printBoard();	//prints table with new turn data
				
				if(game.Win('x')){ 		//checks at the end of every turn if the player won
				    System.out.println("You Win!");
				    //PlayAgain = 0;
				    
				    System.out.println("To play again press 1.");
					PlayAgain = k.nextInt();
					
				    break;
				}
				
				if(game.Win('o')){		//checks at the end of every turn if the computer won
				    System.out.println("You Lost!");
				    //PlayAgain = 0;
				    
				    System.out.println("To play again press 1.");
					PlayAgain = k.nextInt();
					
				    break;
				}
				
				else if(game.Tie()){	//checks at the end of every turn if there was a tie 
					System.out.println("It's a tie!");
					//PlayAgain = 0;
					
					System.out.println("To play again press 1.");
					PlayAgain = k.nextInt();
					
					break;
				}
			}
		}
		
		
	}
	
	public static void table(){ 	//creates a new empty table
	    for (int i = 0; i < 3; i++)
	        for (int p=0; p < 3; p++)
	            table [i][p]= ' ';
	}
	
	public static void playTurn(int row, int column){	//processes the turn by changing the values in the array 
														//and plays turn for the computer
	    table[row][column]='x';
	    
	    int sucessfulCompTurn = 0;
	    
	    while(sucessfulCompTurn == 0){
	    	int compRow = (int)(Math.random()*3);
	    	int compColumn = (int)(Math.random()*3);
	    
	    	if(isEmpty(compRow,compColumn)){
	    		table[compRow][compColumn]='o';
	    		sucessfulCompTurn = 1;
	    	}
	    }
	}
	public static void printBoard(){	//prints the table in the console
		System.out.println("  0  " + table[0][0] + " | " + table[0][1] + " | " + table[0][2]);
	    System.out.println("     --+---+--");
	    System.out.println("  1  " + table[1][0] + " | " + table[1][1] + " | " + table[1][2]);
	    System.out.println("     --+---+--");
	    System.out.println("  2  " + table[2][0] + " | " + table[2][1] + " | " + table[2][2]);
	    System.out.println("     0   1   2 ");
	}
	
	public static boolean isEmpty(int row, int column){		//checks if requested location is avaible

		if(table[row][column]=='x' || table[row][column]=='o')
	        return false;
		
		return true;
	}

	public boolean Win(char cha){ 		//checks if someone won the game
        
		if(table [0][0]==table[1][0] && table[1][0] == table[2][0] && (table [0][0]==cha)) //left column
        	return true;

        else if(table [0][1]==table[1][1] && table[1][1] == table[2][1] && (table [0][1]==cha))	//mid column
        	return true;
  
        else if(table [0][2]==table[1][2] && table[1][2] == table[2][2] && (table [0][2]==cha))	//right column
        	return true;

        else if(table [0][0]==table[0][1] && table[0][1] == table[0][2] && (table [0][0]==cha))	//top row
        	return true;
        
        else if(table [1][0]==table[1][1] && table[1][1] == table[1][2] && (table [1][0]==cha))	//mid row
        	return true;

        else if(table [2][0]==table[2][1] && table[2][1] == table[2][2] && (table [2][0]==cha))	//bottom row
        	return true;

        else if(table [0][0]==table[1][1] && table[1][1] == table[2][2] && (table [0][0]==cha))	//Diagonal
        	return true;

        else if(table [2][0]==table[1][1] && table[1][1] == table[0][2] && (table [2][0]==cha))	//inverse Diagonal
        	return true;

        else
        	return false;
	}
	
	public boolean Tie() {		//checks is there was a tie
	    int count = 0;
	    while(count <9){
			for (int i = 0; i < 3; i++)
		        for (int p=0; p < 3; p++)
		            if(table [i][p]==' '){
		            	count ++;
		                return false;
		            }
	    }
	    
	    return true;
	}
}
