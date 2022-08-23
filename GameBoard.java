import java.util.ArrayList;
import java.util.Scanner;

public class GameBoard{
	private String slot1 = " - ";
	private String slot2 = " - ";
	private String slot3 = " - ";
	private String slot4 = " - ";
	private String slot5 = " - ";
	private String slot6 = " - ";
	private String slot7 = " - ";
	private String slot8 = " - ";
	private String slot9 = " - ";
	private boolean gameOver = false;

	// global array
	public static ArrayList<String> slotsLeft;

	// initial method to run just once to load all of the slots.
	static{
		slotsLeft = new ArrayList<>();
		slotsLeft.add("a1");
		slotsLeft.add("a2");
		slotsLeft.add("a3");
		slotsLeft.add("b4");
		slotsLeft.add("b5");
		slotsLeft.add("b6");
		slotsLeft.add("c7");
		slotsLeft.add("c8");
		slotsLeft.add("c9");
	}
	

	public void howManySlotsLeft(){

		for(String x : slotsLeft){
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public void showBoard(){
		
		System.out.println(slot1 + "|" + slot2 + "|" + slot3);
		System.out.println("------------");
		System.out.println(slot4 + "|" + slot5 + "|" + slot6);
		System.out.println("------------");
		System.out.println(slot7 + "|" + slot8 + "|" + slot9);
	}

	

	// setter's
	public void insertSlot1(String theSlot1){
		Scanner sc = new Scanner(System.in);
		String mistake;
		
		if(slotsLeft.contains("a1")){
			this.slot1 = theSlot1;
			showBoard();
			System.out.println("ITS IN HERE");
			slotsLeft.remove("a1");
		}else{
			do{
				System.out.println("Choose another number: ");
				mistake = sc.nextLine();

				if(mistake.equals("2")){
					insertSlot2(" O ");
					showBoard();
				}
			}while(mistake == "1");
		}
		
	}

	public void insertSlot2(String theSlot2){
		Scanner sc = new Scanner(System.in);
		String mistake;

		if(slotsLeft.contains("a2")){
			this.slot2 = theSlot2;
			showBoard();
			System.out.println("ITS IN HERE");
			slotsLeft.remove("a2");
		}else{
			do{
				System.out.println("Choose another number: ");
				mistake = sc.nextLine();

				if(mistake.equals("1")){
					insertSlot1(mistake);
					showBoard();
				}
			}while(mistake == "2");
		}
		
	}

	
}
