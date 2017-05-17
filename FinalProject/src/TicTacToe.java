
public class TicTacToe {
	
	static char[][] table = new char[3][3];
	
	public static void main(String args[]){
		table();
		printBoard();
	}
	
	public static void table(){
	    for (int i = 0; i < 3; i++)
	        for (int p=0; p < 3; p++)
	            table [i][p]= ' ';
	}
	
	public static void printBoard(){
		System.out.println("  0  " + table[0][0] + " | " + table[0][1] + " | " + table[0][2]);
	    System.out.println("     --+---+--");
	    System.out.println("  1  " + table[1][0] + " | " + table[1][1] + " | " + table[1][2]);
	    System.out.println("     --+---+--");
	    System.out.println("  2  " + table[2][0] + " | " + table[2][1] + " | " + table[2][2]);
	    System.out.println("     0   1   2 ");
		
	}
}
