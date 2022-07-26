package mankatha;

public class Player {
	
	private int betValue;
	private Card chosenCard;
	private String chosenOrientation;
	
	private Deck deck;
	
//	public Player(int betValue, Card chosenCard, String chosenOrientation) {
//		
//		this.betValue = betValue;
//		this.chosenCard = chosenCard;
//		this.chosenOrientation = chosenOrientation;
//	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	public int getBetValue() {
		return betValue;
	}

	public void setBetValue(int betValue) {
		this.betValue = betValue;
	}

	public Card getChosenCard() {
		return chosenCard;
	}

	public void setChosenCard(Card chosenCard) {
		this.chosenCard = chosenCard;
	}

	public String getChosenOrientation() {
		return chosenOrientation;
	}

	public void setChosenOrientation(String chosenOrientation) {
		this.chosenOrientation = chosenOrientation;
	}

	@Override
	public String toString() {
		return "Player [betValue=" + betValue + ", chosenCard=" + chosenCard + ", chosenOrientation="
				+ chosenOrientation + "]";
	}
	
	  
}
