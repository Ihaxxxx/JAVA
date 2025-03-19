import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] fruits = {"apple","mango","orange","coconut","banana"};
        System.out.println(fruits);

        fruits[0] = "pineapple" ;
        System.out.println(fruits[0]);

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);


//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
//        }


        Arrays.sort(fruits);
        Arrays.fill(fruits,"nigga");


        for(String fruit : fruits){
            System.out.println(fruit);
        }



    }
}
