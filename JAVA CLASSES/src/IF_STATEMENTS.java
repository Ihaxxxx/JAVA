import java.util.Scanner ;
public class IF_STATEMENTS {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in) ;

        String name ;
        int age ;
        boolean isStudent ;


        System.out.print("Enter Your Name : ");
        name = scaner.nextLine() ;

        System.out.print("Enter Your Age : ");
        age = scaner.nextInt();

        System.out.println("Are you a student (true/fasle)");
        isStudent = scaner.nextBoolean();
//        GROUP 1

        if (name.isEmpty()){
            System.out.println("You didnt Entered your name");
        }else {
            System.out.println("Hello "+name+ "!");
        }


//          GROUP 2
        if (age > 65){
            System.out.println("You are a senior");
        } else if (age >= 18){
            System.out.println("You are an adult");
        } else if (age < 0) {
            System.out.println("You havent been born yet");
        } else if (age == 0) {
            System.out.println("You are just born");
        } else{
            System.out.println("You are not an adult");
        }
//          GROUP 3

        if (isStudent){
            System.out.println("You are a student");
        }else {
            System.out.println("You are not a student");
        }
        scaner.close();
    }
}
