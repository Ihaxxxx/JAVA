import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] Choices = {"rock","paper","scissor"};
        String playerChoice ;
        String computerChoice ;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock,paper,scissor) : ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")){
                System.out.println("Invalid Choice");
                continue;
            }
            computerChoice = Choices[random.nextInt(3)];
            System.out.println("Computer Choice " + computerChoice);

            if (playerChoice.equals(computerChoice)){
                System.out.println("It is a tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) || (playerChoice.equals("paper") && computerChoice.equals("rock")) || (playerChoice.equals("scissor") && computerChoice.equals("paper"))){
                System.out.println("You won");
            }else {
                System.out.println("You lose");
            }

            System.out.println("Do you want to play again (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));
            System.out.println("Thanks for playing");


        scanner.close();
    }
}
