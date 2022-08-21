import java.util.ArrayList;

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

	public static ArrayList<Integer> slotsLeft;

	// initial method to run just once to load all of the slots.
	static{
		slotsLeft = new ArrayList<>();
		slotsLeft.add(1);
		slotsLeft.add(2);
		slotsLeft.add(3);
		slotsLeft.add(4);
		slotsLeft.add(5);
		slotsLeft.add(6);
		slotsLeft.add(7);
		slotsLeft.add(8);
		slotsLeft.add(9);
	}
	

	public void howManySlotsLeft(){

		for(int x : slotsLeft){
			System.out.print(x);
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

	

	// setter
	public void insertSlot1(String theSlot1){
		this.slot1 = theSlot1;
		showBoard();
		slotsLeft.remove(0);
		
	}

	
}
