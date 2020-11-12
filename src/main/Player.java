public class Player {
    public Hand hand = new Hand();
    public int bet = 0;
    boolean bust = false;
    boolean standing = false;
    
    public void hit(Card card) {
        hand.setCard(card);
    }
    public int[] sum() {
        int sum[] = new int[2];
        for (Card card : hand.deck) {
            sum[0] = sum[0] + card.getValue()[0];
            sum[1] = sum[1] + card.getValue()[1];
        }
        return sum;
    }

    public void raiseBet(int amount) {
        bet = bet + Math.abs(amount);
    }

}