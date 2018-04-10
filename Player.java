import java.util.ArrayList;

public class Player {

	ArrayList<Card> hand;
	
	public Player() {
		hand = new ArrayList<>(); //the hand a player has
	}
	
	public void addCard(Card card) {
		hand.add(card); //adding a card to a players hand
	}
	
	public int getNumberOfCards() {
		return hand.size();
	}
	
	public Card removeCard(int index) {
		return (Card) hand.remove(index); //remove card from hand
	}
	
}
