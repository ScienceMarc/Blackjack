public class Hand extends Deck {
    private int size = 0;
    public Hand() {
        for (Card card : deck) {
            card.value = -1;
        }
    }
    public void setCard(Card card) {
        deck[size] = card;
        size++;
    }
    public Card getCard(int n) {
        return deck[n];
    }
    public int getSize() {
        return size;
    }
}