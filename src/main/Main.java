import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application; 

//TODO: Add the ability to split, this will be a little complicated because there are specific rules and the player will have two hands.

class Main {
    public static void main(String[] args) {
        Application.launch(FXtest.class, args);/*
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

            players[i].raiseBet(amount);
        }
        clear();

        dealer.hit(deck.getCard());

        do {
            for (int i = 0; i < 3; i++) {
                if (players[i].bust) { //Skip players who have lost.
                    continue; //! Probably not the best solution!
                }
                System.out.print("\u001b[30;41m");
                System.out.println("Dealer's cards:");
                dealer.hand.display();

                int dealerScores[] = new int[2];
                dealerScores[0] = dealer.sum()[0];
                dealerScores[1] = dealer.sum()[1];
                
                if (dealerScores[0] != dealerScores[1] && dealerScores[1] <= 21) {
                    System.out.println("Dealer\'s score: " + dealerScores[0] + " or " + dealerScores[1]);
                }
                else {
                    System.out.println("Dealer\'s score: " + dealerScores[0]);
                }

                switch (i) {
                    case 0: System.out.print("\u001b[33;40m"); break;
                    case 1: System.out.print("\u001b[32;40m"); break;
                    case 2: System.out.print("\u001b[94;40m"); break;
                    
                }
                System.out.println("\nPlayer " + (i + 1));
    
                System.out.println("Your bet: " + players[i].bet);
    
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
                if (!(scores[0] == 21 || scores[1] == 21)) {
                    System.out.println("Options:");
                    System.out.println("1. Hit");
                    System.out.println("2. Stand");
                    System.out.println("3. Raise bet");
        
                    int choice = KBIn.nextInt();
        
                    switch (choice) {
                        case 1: players[i].hit(deck.getCard()); break;
                        case 2: break;
                        case 3:
                            System.out.print("Amount: ");
                            int amount = KBIn.nextInt();
                            players[i].raiseBet(amount);
                            break;
                        default: System.out.print("ERROR"); return; //TODO: Add better input handling
                    }
                }
                
                if (players[i].sum()[0] > 21) {
                    players[i].bust = true;
                }

                clear();
            }
            dealer.hit(deck.getCard());
            if (dealer.sum()[0] > 21) {
                System.out.println("The Dealer busted!");
                return;
            }
        } while(dealer.sum()[0] <= 17 && dealer.sum()[1] <= 17);
        System.out.print("\u001bc");
        for (int i = 0; i < 3; i++) {
            if (!players[i].bust) {
                int dealerScores[] = new int[2];
                dealerScores[0] = dealer.sum()[0];
                dealerScores[1] = dealer.sum()[1];

                int scores[] = new int[2];
                scores[0] = players[i].sum()[0];
                scores[1] = players[i].sum()[1];

                if (scores[0] > dealerScores[0] || scores[1] > dealerScores[0]) {
                    System.out.println("Player " + (i + 1) + " got back " + players[i].bet*1.5);
                }
            }
        }*/
    }

    

    static void clear() {
        System.out.print("\u001b[2J");
        System.out.print("\u001b[0;0H");
    }
}