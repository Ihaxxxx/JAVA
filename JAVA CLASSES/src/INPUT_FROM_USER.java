import java.util.Scanner ;

public class INPUT_FROM_USER {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;
//
//        System.out.print("Enter your name : ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter Your age : ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your gpa : ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false) : " );
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " this years old");
//        System.out.println("Your gpa is " + gpa );
//        System.out.println("Student: " + isStudent );
//        if (isStudent){
//            System.out.println("You are enrolled as student");
//        }else {
//            System.out.println("You are not enrolled as student");
//        }

//        common issue
//        System.out.print("Enter your age :");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Enter your favourite colour :");
//        String color = scanner.nextLine();
//
//        System.out.println("You are " +age+ " years old");
//        System.out.println("You like color " + color);

//        calculate area of rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter width :");
        width = scanner.nextDouble();
        System.out.print("Enter height :");
        height = scanner.nextDouble();

        area = width * height ;

        System.out.println("The area is " +area+ " cm²");





        scanner.close();
    }
}
