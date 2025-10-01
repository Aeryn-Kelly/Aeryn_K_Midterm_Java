import java.util.ArrayList;
import java.util.List;

public class Player {
    public static int PlayerCurrentHealth;
    public static int PlayerMaxHealth;

    public Player(int PlayerMaxHealth) {
        this.PlayerMaxHealth = PlayerMaxHealth;
        this.PlayerCurrentHealth = PlayerMaxHealth;

    }

    public int getPlayerCurrentHealth() {
        return PlayerCurrentHealth;

    }

    public static int getPlayerMaxHealth() {
        return PlayerMaxHealth;

    }

    public static void PlayerTakeDamage(int damageAmount) {
        PlayerCurrentHealth -= damageAmount;
        if (PlayerCurrentHealth < 0) {
            PlayerCurrentHealth = 0;


            if (PlayerCurrentHealth == 0)//have not given health a value
                System.out.println("You Have Lost");

        }
    }

    public static void PlayerHeal(int healAmount) {
        PlayerCurrentHealth += healAmount;
        if (PlayerCurrentHealth > PlayerMaxHealth) {
            PlayerCurrentHealth = PlayerMaxHealth;
        }


//player has health + take damage and heal methods

// player hand goes here

    }
}