package ofc_pineapple;
import java.util.ArrayList;

public class CardGroup extends ArrayList<Card> {
	
	private static final long serialVersionUID = 1L;

	public CardGroup() {
		super();
	}
	
	public String toString() {
		String toReturn = "";
		if (this.size() == 1) {
			toReturn = this.get(0).toString();
		} else if (this.size() > 1) {
			toReturn = "|";
			for (Card card : this) {
				toReturn += card.toString() + "|";
			}
		}
		return toReturn;
	}
}
