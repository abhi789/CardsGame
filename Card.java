
public class Card {

	public static enum values{
		//possible values a card can have
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING; 
	};
	public static enum suits{
		//possible suites of a card;
		SPADES, HEARTS, DIAMONDS, CLUBS;
	};
	
	private suits cardSuit;
	private values cardValue;
	
	
	public Card(values value,suits suit) {
		//assign the cards suit and value
		this.cardValue = value;
		this.cardSuit = suit;
		
	}
	
	public values getCardValue(){
		return this.cardValue;
	}
	
	public suits getCardSuit(){
		return this.cardSuit;
	}
	
	
}
