import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose your attack, Sword, bow, fireball, heal, details of your weapons");

        // make game about... fighting dragon

        Scanner myObj = new Scanner(System.in);
        String attack;

        attack = myObj.nextLine();

        System.out.println("You used " + attack);

        System.out.println("You dealt ___ amount of damage");
    }
}