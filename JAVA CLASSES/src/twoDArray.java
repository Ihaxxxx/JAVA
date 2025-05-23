public class twoDArray {
    public static void main(String[] args) {
        String[] fruits = {"apple","orange","banana"};
        String[] Vegetables = {"potato","gobi","kheera"};
        String[] meat = {"fish","chicken","cow"};

        String[][] groceries = {fruits,Vegetables,meat};

//        groceries[0][0] = "pineaplle";
//        groceries[1][0] = "timatar";
//
//        for (String[] foods : groceries){
//            for (String food : foods){
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }

        char[][] telephone = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};
        for (char[] row : telephone){
            for (char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
