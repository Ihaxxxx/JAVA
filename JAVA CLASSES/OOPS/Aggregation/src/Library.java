public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name,int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void DisplayInfo(){
        System.out.println("The "+this.year+ " " + this.name +" Library");
        System.out.println("Books Available");
        for (Book book : books){
            System.out.println(book.displayInfo());
        }
    }

}
