import java.util.Scanner ;

public class SHOPPING_Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        String item  ;
        double price ;
        int quantity ;
        char currency = '$' ;
        double total ;

        System.out.print("What item you would like to buy : ");
        item = scanner.nextLine();

        System.out.print("What is the price for each item : ");
        price = scanner.nextDouble();

        System.out.print("How many would you like : ");
        quantity = scanner.nextInt();

        total = price * quantity ;

        System.out.println("\nYou have brought " +quantity+ " " + item +"/s");
        System.out.println("Your total is " +currency+total);



        scanner.close();
    }
}
