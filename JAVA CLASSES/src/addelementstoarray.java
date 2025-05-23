import java.util.Scanner;

public class addelementstoarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int size;
        String[] foods;
//        foods[0] = "Biryani";
//        foods[1] = "Pizza";
//        foods[2] = "Chocolate";

        System.out.print("What number of foo you want : ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food : ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods){
            System.out.println(food);
        }

    }
}

