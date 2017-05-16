package ofc_pineapple;

public abstract class AbstractPlayer {
	private String name;
	private CardGroup board[];
	private CardGroup hand;
	
	public AbstractPlayer(String name) {
		this.name = name;
		board = new CardGroup[3];
		hand = new CardGroup();
	}
}
