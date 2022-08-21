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

	// global
	static boolean gameOver = false;
	
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//boolean gameOver = false;

		GameBoard gameBoard = new GameBoard();
		PlayerOne player1 = new PlayerOne();
		PlayerTwo player2 = new PlayerTwo();
		AI cpu = new AI();
		String choice = null;

		do{
			System.out.println("Want to play versus a friend or versus a computer friend?");
			choice = sc.nextLine();

			if(choice.equalsIgnoreCase("friend")){
				gameBoard.showBoard();
				startTheGame();
			}else if(choice.equalsIgnoreCase("computer")){
				// something
			}else{
				System.out.println("Invalid choice..try again.");
			}
			
		}while(choice != "friend" || choice != "computer");

		
  }// main method

	public static void startTheGame(){
		Scanner sc = new Scanner(System.in);
		GameBoard gameBoard = new GameBoard();

		
		do{
			gameBoard.showBoard();
			System.out.println("Player 1! Go\nChoose between 1 - 9");
			int p1Decision = sc.nextInt();

			if(p1Decision == 1){
				gameBoard.insertSlot1(" X ");
			}

			gameBoard.showBoard();
				
		}while(gameOver != true);
	}



	
} // class main
