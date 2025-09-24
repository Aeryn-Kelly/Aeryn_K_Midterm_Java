import java.util.Scanner;


public class Player {
    public static void main(String[] args) {

        int PlayerHealth = 500;
        int BloodLoss = 10;


        Scanner input = new Scanner(System.in);
        System.out.println("Choose your card");

        String CardName = input.nextLine();
        System.out.println("Your chosen card is " + CardName);


        int CurrentHealth = PlayerHealth - BloodLoss;
        System.out.println(CurrentHealth);
    }

}
