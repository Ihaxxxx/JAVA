import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();

        box.setItem(10);

        System.out.println(box.getItem());

        Product<String,Double> product1 = new Product<>("Pizza",5.5);
        Product<String,Integer> product2 = new Product<>("Pizza",15);

        System.out.println(product1.getItem());
        System.out.println(product2.getPrice());


    }
}
