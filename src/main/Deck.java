import java.util.Random;

public class Deck {
    protected Card[] deck = new Card[52];
    private int index = 0; //Keep track of card on top of the deck.
    public Deck() {
        for (int i = 0; i < 52; i++) { //Fill deck with proper cards.
            switch(i%4) {
                case 0: deck[i] = new Card(Card.Suits.HEARTS, i/4 + 1); break;
                case 1: deck[i] = new Card(Card.Suits.DIAMONDS, i/4 + 1); break;
                case 2: deck[i] = new Card(Card.Suits.CLUBS, i/4 + 1); break;
                case 3: deck[i] = new Card(Card.Suits.SPADES, i/4 + 1); break;
            }
        }
        shuffle();
    }
    public void display() {
        for (Card card : deck) {
            if (card.value != -1) {
                card.display();
            }
        }
    }
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < 52; i++) {
            int randomIdx = rand.nextInt(52); //Select a random card index.
            Card temp = deck[randomIdx]; //Copy the card at the random index
            deck[randomIdx] = deck[i]; //Replace the card with the card at the index i
            deck[i] = temp; //Replace the card at the index i with the previous value of the random card.
        }
    }
    public Card getCard() {
        Card card = deck[index];
        index++;
        return card;
    }
}