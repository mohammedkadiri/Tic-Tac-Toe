import java.util.Scanner;

public class TicTacToe {
	
	public static enum player {X, O};
	final static int ROWS = 3, COLS = 3;
	private static int playerOneX, playerOneY, playerTwoX, playerTwoY;
	private static String playerOne, playerTwo;
	private static int row = 0;
	
	
	// Board to store locations of the players
	static char[][] board = new char [3][3];
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		IntialiseBoard();
		instructions();
		
	}
	
	public static boolean isWon() {
		return true;
	}
	
	public static void gamePlay() {
		getPlayers();
		
		// Add while loop
		
		
			getPlayerOneCoordinates();
			drawBoard();
			getPlayerTwoCoordinates();
			drawBoard();
			
		
	
	}
	public static boolean checkPosition(int x, int y) {
		if(board[x][y] == 'X' || board[x][y] == 'Y') {
			System.out.println("Sorry the position has already been taking enter a different position.");
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void getPlayerOneCoordinates() {
		System.out.print(playerOne + " enter your x position: ");
		playerOneX = input.nextInt();
		System.out.print(playerOne + " enter your y position: ");
		playerOneY = input.nextInt();
		if (checkPosition(playerOneX,playerOneY)) {
			getPlayerOneCoordinates();
		}
		else {
			board[playerOneX][playerOneY] = 'X';
		}
	
	}
	
	public static void getPlayerTwoCoordinates() {
		System.out.print(playerTwo + " enter your x position: ");
		playerTwoX = input.nextInt();
		System.out.print(playerTwo + " enter your y position: ");
		playerTwoY = input.nextInt();
		if (checkPosition(playerTwoX,playerTwoY)) {
			getPlayerTwoCoordinates();
		}
		else {
			board[playerTwoX][playerTwoY] = 'O';
		}
	
	}
	
	public static void getPlayers() {
		input.nextLine();
		System.out.print("Enter player " + player.X +"\'s name: ");
		playerOne = input.nextLine();
		System.out.print("Enter player " + player.O + "\'s name: ");
		playerTwo = input.nextLine();
	}
	
	public static void IntialiseBoard() {
		for(int i = 0; i  < ROWS; i++) {
			for(int j = 0; j < COLS; j++) {
				board[i][j] = '-';
			}
		}
	}
	
	public static void drawBoard() {
		System.out.println("---------------");
		for(int i = 0; i < ROWS; i++) {
			System.out.print("| ");
			for(int j = 0; j < COLS; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println("");
			System.out.println("---------------");
		}
	}
	
	public static void instructions() {
		int options;
		System.out.println("Instructions: This is manual two player game");
		System.out.println("- Player 1 will have the mark \"X\"");
		System.out.println("- Player 2 will have the mark \"O\"");
		
		System.out.println("Draw condition:");
		System.out.println("- Upon all slots having been marked without the winnig condition being met.");
		System.out.println("How to play: ");
		System.out.println("- You may only enter a number between 1 and 3 for both rows and columns.");
		
		System.out.println("Game Menu");
		System.out.println("1 - start");
		System.out.println("2 - exit");
		
		System.out.println("Select: ");
		options = input.nextInt();
		
		switch(options) {
			case 1: gamePlay();
					break;
			default: break;
		} 
		
		
	}

}
