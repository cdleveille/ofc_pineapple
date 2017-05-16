package ofc_pineapple;

public class Card {
	
	private int rank;
	private int suit;
	
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public int getrank() {
		return rank;
	}
	
	public String toString() {
		String toReturn = "";
		if (rank == 0) {
			toReturn += "2";
		} else if (rank == 1) {
			toReturn += "3";
		} else if (rank == 2) {
			toReturn += "4";
		} else if (rank == 3) {
			toReturn += "5";
		} else if (rank == 4) {
			toReturn += "6";
		} else if (rank == 5) {
			toReturn += "7";
		} else if (rank == 6) {
			toReturn += "8";
		} else if (rank == 7) {
			toReturn += "9";
		} else if (rank == 8) {
			toReturn += "T";
		} else if (rank == 9) {
			toReturn += "J";
		} else if (rank == 10) {
			toReturn += "Q";
		} else if (rank == 11) {
			toReturn += "K";
		} else if (rank == 12) {
			toReturn += "A";
		} else {
			System.out.println("Invalid card rank: " + rank);
		}
		
		if (suit == 0) {
			toReturn += "c";
		} else if (suit == 1) {
			toReturn += "d";
		} else if (suit == 2) {
			toReturn += "h";
		} else if (suit == 3) {
			toReturn += "s";
		} else {
			System.out.println("Invalid card suit: " + suit);
		}
		
		return toReturn;
	}
}