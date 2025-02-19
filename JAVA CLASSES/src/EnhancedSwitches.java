import java.util.Scanner ;
public class EnhancedSwitches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String day  ;
        System.out.print("Enter the day of the week : ");
        day = scanner.next();
//        switch (day){
//            case "Monday" -> System.out.println("It is a weekday");
//            case "Tuesday" -> System.out.println("It is a weekday");
//            case "Wednesday" -> System.out.println("It is a weekday");
//            case "Thursday" -> System.out.println("It is a weekday");
//            case "Friday" -> System.out.println("It is a weekday");
//            case "Saturday" -> System.out.println("It is a weekend");
//            case "Sunday" -> System.out.println("It is a weekend");
//            default -> System.out.println(day + " is not a a day");
//        }
                switch (day){
            case "Monday","Tuesday" ,"Wednesday" ,"Thursday" ,"Friday" -> System.out.println("It is a weekday");
            case "Saturday","Sunday" -> System.out.println("It is a weekend") ;
            default -> System.out.println(day + " is not a a day");
        }
    }
}
