import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess ;
        int attempts = 0 ;
        int min ;
        int max ;
        System.out.print("Enter the minimum number for the game : ");
        min = scanner.nextInt();
        System.out.print("Enter the maximum number for the game : ");
        max = scanner.nextInt();
        int randomNumber = random.nextInt(min,max+1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d - %d \n",min,max);
        do {
            System.out.print("Enter a number : ");
            guess = scanner.nextInt();
            attempts++ ;
            if (guess<randomNumber){
                System.out.println("Too low try again");
            }else if (guess>randomNumber){
                System.out.println("Too high try again");
            }
        }while (guess != randomNumber);

        System.out.println("Congratulations you guessed the number "+randomNumber+" in " +attempts + " attempts");
    }

}
