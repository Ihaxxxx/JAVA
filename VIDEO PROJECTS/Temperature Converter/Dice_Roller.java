import java.util.Random;
import java.util.Scanner;

public class Dice_Roller {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
//        DECLARE VARIABLES
//        Number of dice from user
//        validate


        int timesToRole ;
        int total = 0;

        System.out.print("Enter the number of dice to role : ");
        timesToRole = scanner.nextInt();

        while (timesToRole <= 0){
            System.out.println("Number of dice must be greater than zero");
            System.out.print("Enter the number of dice to role : ");
            timesToRole = scanner.nextInt();
        }

        for (int i = 0; i < timesToRole; i++) {
            int roll = random.nextInt(1,7);
            printdie(roll);
            System.out.println("You rolled "+roll);
            total += roll ;
        }
        System.out.println(total);

        scanner.close();
    }

    static void printdie(int roll ){
        String dice1 = """
                 ______
                |      |
                |   0  |
                |______|
                
                """;
        String dice2 = """
                 ______
                |      |
                | 0  0 |
                |______|
                
                """;
        String dice3 = """
                 ______
                |     0|
                |   0  |
                |0     |
                |______|
                
                """;
        String dice4 = """
                 ______
                | 0  0 |
                |      |
                | 0  0 |
                |______|
                
                """;
        String dice5 = """
                 ______
                | 0  0 |
                |   0  |
                | 0  0 |
                |______|
                
                """;
        String dice6 = """
                 ______
                | 0  0 |
                | 0  0 |
                | 0  0 |
                |______|
                
                """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}
