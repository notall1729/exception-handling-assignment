import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){

    }

    public void addBook(Book book) throws InvalidBookException{

    }

    private Book findBook(String title){

    }

    public void borrowBook(String title) throws BookNotFoundException{

    }

    public void returnBook(String title) throws BookNotFoundException {

    }

    public void listBooks() throws EmptyLibraryException{

    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
