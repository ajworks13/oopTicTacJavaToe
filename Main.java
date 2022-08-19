import java.util.*;
/*
	NOTES:
		2 player game. or play with AI.
		draw the board with 9 squares.
		Make it so  each square cant get replaced by the other player or AI.
		dont allow the player to enter anything else but one of the squares. 

		each square will be its own method. Once used, it can not be reused until the game is restarted.
		Make sure the game can get into a draw state.

		close scanner leak later.
		
*/

class Main {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean gameOver = false;

		GameBoard gameBoard = new GameBoard();
		PlayerOne player1 = new PlayerOne();
		PlayerTwo player2 = new PlayerTwo();
		AI cpu = new AI();

		do{
			System.out.println("Want to play versus a friend or versus a computer friend?");
			String choice = sc.nextLine();

			if(choice.equals("friend")){
				gameBoard.showBoard();
				
			}
		}while(gameOver != true);

		
  }// main method




	
} // class main
