import java.util.Random ;
public class randomNumbers {
    public static void main(String[] args) {
        Random randon = new Random() ;

        int number1 ;
        int number2 ;
        int number3 ;
        number1 = randon.nextInt(1,101);
        number2 = randon.nextInt(1,101);
        number3 = randon.nextInt(1,101);


        double decimal ;
        decimal = randon.nextDouble();

        boolean isHeads ;
        isHeads = randon.nextBoolean();

        if (isHeads){
            System.out.println("Heads");
        }else {
            System.out.println("Tails");
        }


    }
}
