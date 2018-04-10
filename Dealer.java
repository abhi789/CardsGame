import java.util.ArrayList;

public class Dealer {

	ArrayList<Player> players;
	Deck mainDeck;
	
	public Dealer(ArrayList players, int deckSize) {
		this.players = players; //get all of the players
		mainDeck = new Deck(); //initialize main deck
		for(int i = 0; i < deckSize; i++){
			Deck d = new Deck();  //if more than one deck is needed, initialize them and combine in a single deck
			mainDeck.cards.addAll(d.cards);
			
		}
	}
	
	public void dealCards() throws Exception{
		for(Player player : players){
			player.hand.add(mainDeck.dealCard()); //deal a card to each available player
		}
	}
	
	public void addCards(ArrayList<Card> cards){
		for(Card c : cards){
			mainDeck.addCard(c); //add cards to a deck
		}
	}
}


