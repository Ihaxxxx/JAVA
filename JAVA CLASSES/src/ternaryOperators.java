public class ternaryOperators {
    public static void main(String[] args) {
//        variable = (condition) ? true : false
        int score = 70 ;
        String passOrFail = (score>=60)? "PASS":"FAIL";
//        System.out.println(passOrFail);

        int number = 4 ;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
//        System.out.println(evenOrOdd);

        int hours = 13 ;

        String timeOfDay = (hours < 12) ? "AM" : "PM" ;
//        System.out.println(timeOfDay);

        int income = 15000 ;
        double taxRates = (income >= 40000 ) ? 0.25 : 0.15 ;
        System.out.println(taxRates);
    }
}
