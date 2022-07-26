package mankatha;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> deck;
	private final ArrayList<Card> defaultDeck;
	
	public Deck() {
		this.deck = new ArrayList<Card>(52);
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 13; j++) {
				deck.add(new Card(j, i));
			}
		}
		this.defaultDeck = this.deck;
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
	public Card deal() {
		if(deck.isEmpty()) {
			return null;
		}
		return deck.remove(0);
	}
	public void reset() {
		this.deck = this.defaultDeck;
	}
}
