import java.util.Scanner ;

public class Maths_Functions {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in) ;

//        System.out.println(Math.PI);

//        System.out.println(Math.E);

        double result ;
        result = Math.pow(3,3) ;
//        System.out.println(result);

        result = Math.abs(-2);
//        System.out.println(result);

        result = Math.sqrt(81) ;
//        System.out.println(result);

        result = Math.round(3.13);
//        System.out.println(result);
//        round up
        result = Math.ceil(3.14);
//        System.out.println(result);

        result = Math.floor(3.99);
//        System.out.println(result);

        result = Math.max(10,20);
//        System.out.println(result);

        result = Math.min(10,20);
//        System.out.println(result);

//        hypotenese formula a^2 = b^2 + c^2
//        double Base ;
//        double Height ;
//        double Hypotnese ;
//
//        System.out.print("Enter Base : ");
//        Base = scanner.nextDouble();
//
//        System.out.print("Enter Height : ");
//        Height = scanner.nextDouble();
//
//        Hypotnese = Math.sqrt(Math.pow(Base,2)+Math.pow(Height,2));
//
//        System.out.println("The hypotenus is "+Hypotnese);
//        scanner.close();

//        Area Circumference and Volume
        double radius ;
        double Area ;
        double Circumference ;
        double Volume ;


        System.out.print("Enter the radius : ");
        radius = scanner.nextDouble();

        Circumference = 2 *Math.PI*radius ;

        System.out.printf("The Circumference of the circle is %.1fcm\n",Circumference);

        Area = Math.PI * Math.pow(radius,2) ;
        System.out.printf("The Area of the circle is %.1fcm²\n",Area);

        Volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        System.out.printf("The Volume of the circle is %.1fcm³\n",Volume);

        scanner.close();
    }
}
