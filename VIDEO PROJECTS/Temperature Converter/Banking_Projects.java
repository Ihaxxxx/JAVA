import java.util.Scanner;

public class Banking_Projects {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Banking App
//        Declare Variable
        double balance = 0;
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
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }

        }
        System.out.println("***************************");
        System.out.println("Thank You for using the atm");
        System.out.println("***************************");

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
    static double deposit(){
        double amount ;

        System.out.print("Enter the amount to deposit : ");
        amount = scanner.nextDouble();

        if ( amount < 0 ){
            System.out.println("Amount can be negative");
            return 0 ;
        }else {
            return amount ;
        }

    }
    static double withdraw(double balance){
        double amount ;
        System.out.print("Enter amount to be withdrawn : ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Insufficient funds");
            return 0;
        }else if (amount < 0){
            System.out.println("Amount cant be negative");
            return 0;
        }else {
            return amount;
        }
    }
}
