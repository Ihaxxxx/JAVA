import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.print(i+" ");
        }
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the amount of times you have to loop : ");
//        int max = scanner.nextInt();
//        for (int i = 1; i <= max ; i++) {
//            System.out.println(i);
//        }

//        System.out.print("How many seconds to countdown from ? : ");
//        int start = scanner.nextInt();
//        for (int i = start; i > 0 ; i--) {
//            System.out.println(i);
//            Thread.sleep(300);
//        }
//
//        System.out.println("Happy new year");
    }
}
