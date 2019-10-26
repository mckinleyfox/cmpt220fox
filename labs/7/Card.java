
public class Card {
	int[] deck = new int[52];
	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	String[] num = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	Card() {
	    for (int i = 0; i < deck.length; i++) {
	      deck[i] = i;
	    }
	}
}
