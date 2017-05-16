package ofc_pineapple;
import java.util.Random;

public class Deck extends CardGroup {
	
	private static final long serialVersionUID = 1L;
	private Random rng;
	
	public Deck() {
		super();
		rng = new Random();
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 0; rank < 13; rank++) {
				this.add(new Card(rank, suit));
			}
		}
	}
	
	public void shuffle() {
		for (int reps = 0; reps < 100; reps++) {
			for (int i = 0; i < this.size(); i++) {
				int j = rng.nextInt(52);
				Card card = this.get(i);
				this.remove(i);
				this.add(j, card);
			}
		}
	}
	
	public Card deal() {
		return this.remove(0);
	}
	
	public CardGroup deal(int reps) {
		CardGroup toReturn = new CardGroup();
		for (int i = 0; i < reps; i++) {
			toReturn.add(this.remove(0));
		}
		return toReturn;
	}
}
