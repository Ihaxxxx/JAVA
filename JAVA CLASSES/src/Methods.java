public class Methods {
    public static void main(String[] args) {

        String name = "Mubashir";
        int age = 18 ;

//        happyBirthday(name,age);
        double squreVal = square(5.5) ;
        System.out.println(squreVal);

        double cubeVal = cube(3) ;
        System.out.println(cubeVal);

        String fullName = getFullName("Mubashir","Asif");
        System.out.println(fullName);

        boolean isLegal = isVerified(15);
        System.out.println(isLegal);

        int Checkage = 9 ;
        if (isVerified(age)){
            System.out.println("You may sign up");
        }else {
            System.out.println("You can sign up");
        }
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
    static Boolean isVerified(int age){
        if (age >= 18){
            return true ;
        }else {
            return false;
        }
    }
}
