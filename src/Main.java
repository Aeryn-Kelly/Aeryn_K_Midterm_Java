import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose your attack, Sword, bow, fireball, heal, details of your weapons");

        // make game about... fighting boss

        Scanner myObj = new Scanner(System.in);
        String attack;

        attack = myObj.nextLine();

        System.out.println("You used " + attack);

        System.out.println("You barely did a scratch");
        System.out.println("You did a decent amount of damage");
        System.out.println("Now that's a lot of damage!");
        System.out.println("THERE GOES HIS FINGER!");
    }
}