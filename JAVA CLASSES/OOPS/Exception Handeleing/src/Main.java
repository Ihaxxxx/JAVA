import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try {
//            System.out.println(1/0);
//        }catch (ArithmeticException e){
//            System.out.println("You cant divide by 0");
//        }

         try(Scanner scanner = new Scanner(System.in)) {
             System.out.print("Enter a number : ");
             int number = scanner.nextInt();
             System.out.println(number);
         }catch (InputMismatchException e){
             System.out.println("That wasnt a number");
         }
         catch (Exception e){
//             Safety net do it in the end
             System.out.println("Something went wrong ");
         }
         finally {
             System.out.println("this always executes");
         }
    }
}