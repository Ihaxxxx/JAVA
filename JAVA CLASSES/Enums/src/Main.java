import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week : ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);


            switch (day){
                case MONDAY, FRIDAY, WEDNESDAY, TUESDAY, THURSDAY -> System.out.println("It is weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is weekend");
            }

        }catch (IllegalArgumentException e){
            System.out.println("PLease enter a Valid Date");
        }

        scanner.close();

    }
}
