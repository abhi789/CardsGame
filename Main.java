import java.util.ArrayList;

public class Main {

	public Main() throws Exception {
		
	}
	
	public static void main(String[] args){
		ArrayList<Player> p = new ArrayList<Player>();
		Player p1 = new Player(); //player 1 
		p.add(p1);
		Player p2 = new Player(); //player 2
		p.add(p2);
		Dealer d = new Dealer(p, 1); //new dealer initialized
		try{
			d.dealCards();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(p1.hand.get(0).getCardValue()); 
		System.out.println(p2.hand.get(0).getCardValue());
	}

}
