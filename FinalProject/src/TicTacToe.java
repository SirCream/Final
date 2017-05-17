
public class TicTacToe {
	
	static String[][] table = new String[3][3];
	
	public static void main(String args[]){
		printBoard();
	}
	
	public static void printBoard(){
		System.out.println("0" + table[0][0] + "|" + table[0][1] + "|" + table[0][2]);
	    System.out.println("-------");
	    System.out.println("1" + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
	    System.out.println("-------");
	    System.out.println("2" + table[2][0] + "|" + table[2][1] + "|" + table[2][2]);
	    System.out.println("0 1 2 ");
		
	}
	

}
