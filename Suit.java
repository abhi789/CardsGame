import java.util.ArrayList;

public class Suit {
	
	Card.suits suitValue;
	ArrayList<Card> cards; //all cards of that suite
	
	public Suit(Card.suits suitValue) {
		
		
		this.suitValue = suitValue;
		
		cards = new ArrayList<>();
		
		for(Card.values cardValue: Card.values.values()){
			cards.add(new Card(cardValue,suitValue)); //generate all cards of a particular suite like diamonds
		}
	}
	
	
}
