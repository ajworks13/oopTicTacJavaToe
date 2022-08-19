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



	public void showBoard(){
		//System.out.println("   |   |   ");
		System.out.println(slot1 + "|" + slot2 + "|" + slot3);
		System.out.println("------------");
		System.out.println(slot4 + "|" + slot5 + "|" + slot6);
		System.out.println("------------");
		System.out.println(slot7 + "|" + slot8 + "|" + slot9);
		//System.out.println("   |   |   ");
	}
}
