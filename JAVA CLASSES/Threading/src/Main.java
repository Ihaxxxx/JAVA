import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        MyRunnable runnable = new MyRunnable();

        System.out.println("You have 5 seconds to enter your name");
        Thread thread = new Thread(runnable);


        thread.setDaemon(true);
        thread.start();

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();

    }
}
