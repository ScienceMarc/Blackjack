public class Card {
    public enum Suits {
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES
    }
    public Suits suit;
    public int value;

    public Card(Suits suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public void display() {
        String valName;
        switch(value) { //Special names for certain values
            case 1: valName = "Ace"; break;
            case 11: valName = "Jack"; break;
            case 12: valName = "Queen"; break;
            case 13: valName = "King"; break;
            default: valName = Integer.toString(value);
        }
        System.out.println(valName + " of " + suit.toString().toLowerCase()); //enums require a little persuation to print their name correctly
    }
    
    public int[] getValue() {
        int ret[] = new int[2];
        if (this.value < 1) {
            ret[0] = ret[1] = 0;
            return ret;
        }
        switch (this.value) {
            case 1: ret[0] = 1; ret[1] = 11; break;
            case 11: case 12: case 13: ret[0] = ret[1] = 10; break;
            default: ret[0] = ret[1] = this.value;
        }
        return ret;
    }
    public void setValue(int value) {
        this.value = value;
    }
}