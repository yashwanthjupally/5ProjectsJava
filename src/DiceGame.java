import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DiceGame {
    public static void main(String[] args) {

        try {
            System.out.println("How many dice would you like to roll?");
            Scanner scan = new Scanner(System.in);
            int numberOfDice = scan.nextInt();
            System.out.println("About to roll " + numberOfDice + " dice");

            Random random = new Random();
            for (int i = 0; i < numberOfDice; i++) {
                int die = random.nextInt(6)+1;
                System.out.println(display(die));
            }
        }catch (InputMismatchException e){
            System.out.println("Please enter a valid number");
        }

    }

    public static String display(int value){
        return switch (value) {
            case 1 -> "---------\n|       |\n|   O   |\n|       |\n---------";
            case 2 -> "---------\n| O     |\n|       |\n|     O |\n---------";
            case 3 -> "---------\n| O     |\n|   O   |\n|     O |\n---------";
            case 4 -> "---------\n| O   O |\n|       |\n| O   O |\n---------";
            case 5 -> "---------\n| O   O |\n|   O   |\n| O   O |\n---------";
            case 6 -> "---------\n| O O O |\n|       |\n| O O O |\n---------";
            default -> "Not a valid die";
        };
    }
}
