import java.util.Scanner ;
public class weight_converter {
    public static void main(String[] args) {
//        WEIGHT CONVERSION PROGRAM
        Scanner scanner = new Scanner(System.in);
//        Declare Variables
        double weight ;
        double newWeight ;
        int choice ;

//        welcome messages
        System.out.println("Welcome to weight conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

//        prompt for user input
        System.out.print("Enter your choice : ");
        choice = scanner.nextInt() ;

//        opt1 convert lbs to kgs
//        opt2 convert kgs to lbs

            if (choice == 1){
                System.out.print("Enter your weight in lbs : ");
                weight = scanner.nextDouble();
                newWeight = weight * 0.453592 ;
                System.out.printf("The new weight in kgs is : %.2f " , newWeight);
            } else if (choice == 2) {
                System.out.print("Enter your weight in kgs : ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462 ;
                System.out.printf("The new weight in lbs is : %.2f " , newWeight);
//        else print not a valid choice
            }else {
                System.out.println("That was not a valid choice");
            }

            scanner.close();

    }
}
