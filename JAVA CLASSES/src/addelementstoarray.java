import java.util.Scanner;

public class addelementstoarray {
    Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        String[] foods = new String[3];
        foods[0] = "Biryani";
        foods[1] = "Pizza";
        foods[2] = "Chocolate";
        for (String food : foods){
            System.out.println(food);
        }
    }
}

