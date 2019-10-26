
public class Deck {
	private Card[] deck;
	public Deck() {
		deck = new Card[52];
	}
	int i =0;
	for(int suit = Card.Diamonds; suit <= Card.Spades, suit++) {
		for(int num = 1; num <= 13; num ++) {
			deck[i++] = new Card(suit, num);
		}
	}
}
