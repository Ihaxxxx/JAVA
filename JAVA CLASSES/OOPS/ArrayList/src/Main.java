import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        String[] fruits = {"Apple","Pineapple"};
//
//        System.out.println(fruits);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//        list1.add(6);
//
//        System.out.println(list1);
//
//        ArrayList<Double> list2 = new ArrayList<>();
//
//        list2.add(3.5);
//        list2.add(4.5);
//        list2.add(5.5);
//        list2.add(6.5);
//
//        System.out.println(list2);
//
//        ArrayList<String> list3 = new ArrayList<>();
//
//        list3.add("Apple");
//        list3.add("Orange");
//        list3.add("Banana");
//        list3.add("Coconut");
//
//        list3.remove(0);
//        list3.set(0,"Pineapple");
//
////        System.out.println(list3.get(2));
//
//
//        System.out.println(list3.size());
//
//        Collections.sort(list3);
//
//        System.out.println(list3);
//
//
//        for (String fruit : list3){
//            System.out.println(fruit);
//        }
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the number of foods you like to enter : ");
        int numOfFoods =  scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfFoods; i++) {
            System.out.print("Enter food #" + i +": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


        scanner.close();
    }
}
