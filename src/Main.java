import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();


        System.out.println("Your Hand (These are placeholder cards, they do nothing)");

        for (int i = 0; i < 7; i++) {
            Cards card = deck.dealCard();
            if (card != null) {
                System.out.println(card);
            }
        }



        System.out.println();//health methods go here

        //your health
        Player player;
        player = new Player(250);
        System.out.println("Your Starting Health " + Player.getPlayerMaxHealth());

        Player.PlayerTakeDamage(10); //HealthDrain

        //dealer Health
        Dealer dealer;
        dealer = new Dealer(250);
        System.out.println("Dealer Starting Health " + Dealer.getDealerMaxHealth());

        Dealer.DealerTakeDamage(10); //HealthDrain

        System.out.println();

        Scanner PlayerTurn = new Scanner(System.in);
        System.out.println("Choose a Card");

        String PlayedTurn = PlayerTurn.nextLine();
        System.out.println("You Played " + PlayedTurn);

        System.out.println();

        System.out.println("What Card Will You Attack");

        System.out.println();

            System.out.println("Your CurrentHealth " + Player.PlayerCurrentHealth);

            System.out.println("Dealer Current Health " + Dealer.DealerCurrentHealth);

            //health here
            //dealer health is shown just so you know code works, won't be in final game
        }
    }
