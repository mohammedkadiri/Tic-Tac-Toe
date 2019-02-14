
public class TicTacToe {
	
	public static enum pieces  {X, O};
	public static void main(String[] args) {
		
		drawBoard();
		
		// Board to store locations of the players
		int[][] board = new int[2][2];
		
	}
	
	public static void drawBoard() {
		System.out.println("        COL  COL  COL");
		System.out.println("         1    2   3");
		System.out.println("ROW 1       |   |   ");
		System.out.println("         ---|---|---");
		System.out.println("ROW 2       |   |   ");
		System.out.println("         ---|---|---");
		System.out.println("ROW 3       |   |   ");
	}

}
