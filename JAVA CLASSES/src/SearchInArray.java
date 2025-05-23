import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7};
        String[] fruits = {"apple","orange","banana"};
        String ValueToFind ;
        System.out.print("Enter a fruit to search : ");
        ValueToFind = scanner.nextLine();

//        boolean isFound = false;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == target){
//                System.out.println("Element found at index : " + i);
//                isFound = true;
//                break;
//            }
//        }
//        if (!isFound){
//            System.out.println("The element is not in the list");
//        }
        boolean isFound = false;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(ValueToFind
            )){
                System.out.println("Element found at index : " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("The element is not in the list");
        }

        scanner.close();

    }
}
