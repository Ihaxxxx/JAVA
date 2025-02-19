public class Methods {
    public static void main(String[] args) {

        String name = "Mubashir";
        int age = 18 ;

//        happyBirthday(name,age);
        double squreVal = square(5.5) ;
        System.out.println(squreVal);

        double cubeVal = cube(3) ;
        System.out.println(cubeVal);



    }
    static void happyBirthday(String Name, Integer age ){
        System.out.println("1 "+Name);
        System.out.println("2 "+age);
    }
    static double square(double number){
        return number * number ;
    }
    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String first,String last){
        return first + " " + last;
    }
}
