import java.util.ArrayList;
import java.util.List;

public class Dealer {
    public static int DealerCurrentHealth;
    public static int DealerMaxHealth;

    public Dealer(int DealerMaxHealth) {
        this.DealerMaxHealth = DealerMaxHealth;
        this.DealerCurrentHealth = DealerMaxHealth;

    }

    public int getDealerCurrentHealth() {
        return DealerCurrentHealth;

    }

    public static int getDealerMaxHealth() {
        return DealerMaxHealth;

    }

    public static void DealerTakeDamage(int damageAmount) {
        DealerCurrentHealth -= damageAmount;
        if (DealerCurrentHealth < 0) {
            DealerCurrentHealth = 0;


            if (DealerCurrentHealth == 0)//only true because I have not given a value
                System.out.println("You Have Won!");

        }
    }

    public void PlayerHeal(int healAmount) {
        DealerCurrentHealth += healAmount;
        if (DealerCurrentHealth > DealerMaxHealth) {
            DealerCurrentHealth = DealerMaxHealth;
        }

    }

}

//Dealer has health + take damage and heal methods

//Add Hard Dealer, and Extra Hard Dealer