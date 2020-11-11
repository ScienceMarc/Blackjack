import java.util.Scanner;


//TODO: Add the ability to split, this will be a little complicated because there are specific rules and the player will have two hands.

public class Game {
    public Game() {
        Deck deck = new Deck();
        Player dealer = new Player();
        Player players[] = new Player[3];

        Scanner KBIn = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            players[i] = new Player();
        }

        for (int i = 0; i < 3; i++) {
            //Give all players two cards
            players[i].hit(deck.getCard());
            players[i].hit(deck.getCard());

            //Allow players to place initial bets.
            System.out.print("Player " + (i + 1) + "\'s bet: ");

            int amount = KBIn.nextInt();

            players[i].raiseBet(Math.abs(amount));
        }
        clear();

        dealer.hit(deck.getCard());

        for (int i = 0; i < 3; i++) {
            System.out.println("Player " + (i + 1));

            System.out.print("Your bet: " + players[i].bet);

            System.out.println("Dealer's cards:");
            dealer.hand.display();

            System.out.println("\nYour cards:");
            players[i].hand.display();
            int scores[] = new int[2];
            scores[0] = players[i].sum()[0];
            scores[1] = players[i].sum()[1];

            System.out.print("\n");
            if (scores[0] != scores[1] && scores[1] <= 21) {
                System.out.println("Your score is: " + scores[0] + " or " + scores[1]);
            }
            else {
                System.out.println("Your score is: " + scores[0]);
            }

            System.out.println("Options:");
            System.out.println("1. Hit:");
            System.out.println("2. Stand");
            System.out.println("3. Raise bet");

            int choice = KBIn.nextInt();

            switch (choice) {
                case 1: players[i].hit(deck.getCard()); break;
                case 2: break;
                case 3:
                    
            }

            clear();
        }

    }
    void clear() {
        System.out.print("\u001b[2J");
        System.out.print("\u001b[0;0H");
    }
}