import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows ;
        int column ;
        char symbol ;

        System.out.print("Enter the amount of rows : ");
        rows = scanner.nextInt();
        System.out.print("Enter the amount of coloumns : ");
        column = scanner.nextInt();
        System.out.print("Enter the character : ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < column ; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

//        for (int j = 0; j < 3; j++) {
//            for (int i = 0; i < 10; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println(" ");
//        }
    }
}
