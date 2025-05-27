public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The niggers",200);
        Book book2 = new Book("Meow Meow",490);
        Book book3 = new Book("Bruh",416);

        Book[] books = {book1,book2,book3};

//        for (Book book : books){
//            System.out.println(book.displayInfo());
//        }

        Library library = new Library("Morphy",2006,books);

        library.DisplayInfo();

    }
}