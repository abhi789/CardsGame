import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	
	ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();	
		for(Card.suits suitValue: Card.suits.values()){
				Suit newSuit = new Suit(suitValue); //creating a new suit for all cards
				cards.addAll(newSuit.cards); //add suits to the main deck
		}
	}
	
	public void shuffleDeck(){
		Collections.shuffle(cards); //shuffling the cards
	}
	
	public Card dealCard() throws Exception {
		if(cards.isEmpty()){
			throw new Exception("Deck is Already Empty"); //all cards already dealt
		}
		return cards.remove(cards.size()-1);
	}
	
	public void addCard(Card card){
		cards.add(card);  //add cards to the deck
	}
	
	public int getRemainingCards(){
		return cards.size(); //check remaining cards in deck
	}

}
