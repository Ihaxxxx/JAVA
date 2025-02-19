import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
//        double temp = -10 ;
//
//        boolean isSunny = false ;
//
//        if (temp <=30 && temp>=0 && isSunny) {
//            System.out.println("The weather is good");
//            System.out.println("it is sunny outside");
//        } else if (temp <=30 && temp>=0 && !isSunny) {
//            System.out.println("The weather is good");
//            System.out.println("it is cloudy outside");
//        } else if (temp>30 || temp < 0) {
//            System.out.println("The weather is harsh");
//        }

//        username must be btw 4-14 characters
//        it must not contain spaces and underscores

        String username ;
        System.out.print("Enter your username : ");
        username = scanner.nextLine();
        if (username.length()<4 || username.length()>12){
            System.out.println("username must be between 4-12 characters");
        } else if (username.contains(" ") || username.contains(("_"))) {
            System.out.println("username must not contain spaces or underscores");
        } else {
            System.out.println("Welcome "+username);
        }
        scanner.close();
    }
}
