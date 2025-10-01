
import java.util.ArrayList;

public class Cards {

    public Cards(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;

        var cardHealth = suit.value;
        //make variable card health = suit.value
    }

    enum Rank {
        Teeth(5), claws(6), fist(7), legs(8), head(9), tail(10);

        final int value;
        Rank(int value){
            this.value = value;
        }

    }

    enum Suit {
        crow(5), monkey(6), frog(7), cat(8), dog(9), eagle(10), turtle(11);

        final int value;
        Suit(int value){
            this.value = value;
        }

    }

    final Suit suit;
    final Rank rank;


    public Suit getSuit() {
        return suit;

    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of the " + suit;
    }
}







