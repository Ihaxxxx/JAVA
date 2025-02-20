import java.util.Scanner;
import java.util.Stack;

public class Banking_Projects {
    public static void main(String[] args) {
//        Banking App
//        Declare Variable
        Scanner scanner = new Scanner(System.in);
        double balance = 10;
        boolean isRunning = true;
        int choice;


        while (isRunning) {
//        Display Menu
            System.out.println("***************");
            System.out.println("Banking Progrsm");
            System.out.println("***************");
            System.out.println("1 . Show Balance");
            System.out.println("2 . Deposit");
            System.out.println("3 . Withdraw");
            System.out.println("4 . Exit");

            System.out.print("Enter your choice 1 - 4 : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> ShowBalance(balance);
                case 2 -> Deposit();
                case 3 -> WithDraw();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }

        }

//        Get and process users choice
//        ShowBalance()
//        Deposit()
//        Withdraw(}


        scanner.close();
    }
    static void ShowBalance(double balance){
        System.out.println("***************");
        System.out.printf("$ %.2f \n",balance);
        System.out.println("***************");


    }
    static double deposit(double amount){
        return balance - amount ;
    }
}
