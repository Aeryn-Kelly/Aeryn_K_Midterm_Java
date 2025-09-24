//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("This is your hand");
        for (int i = 0; i < 7; i++) {
            Cards card = deck.dealCard();
            if (card != null) {
                System.out.println(card);
            }
        }

        System.out.println("What card do you want to play");
    }
}