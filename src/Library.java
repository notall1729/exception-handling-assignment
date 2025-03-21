import java.util.ArrayList;
import Exception.InvalidBookException;
import Exception.BookNotFoundException;
import Exception.EmptyLibraryException;

public class Library {
    private ArrayList<Book> books;

    public Library(){
      books = new ArrayList<>();
    }

    public void addBook(Book book) throws InvalidBookException{
       if(book == null) {
           throw new InvalidBookException("Book should not be null.");
       }
           books.add(book);
    }

    private Book findBook(String title){
        for(Book book : books){
            if(book.getTitle().equals(title))
                return book;
        }
        return null;
    }

    public void borrowBook(String title) throws BookNotFoundException, EmptyLibraryException {
        if(books == null)
            throw new EmptyLibraryException("Library is empty, no books to borrow.");
        if(findBook(title) == null)
            throw new BookNotFoundException("Book with title " + title + " not found.");

          System.out.println(findBook(title).toString() + " successfully loaned.");
    }

    public void returnBook(String title) throws BookNotFoundException {
        Book book = findBook(title);
          if(book == null)
              throw new BookNotFoundException("Connot return. Book with title " + title + " not found.");

         System.out.println(book.toString() + " successfully return.");
    }

    public void listBooks() throws EmptyLibraryException{
         if(books == null)
             throw new EmptyLibraryException("Library is empty.");


             System.out.println("Books in the library:");
             for (int i = 0; i < books.size(); ++ i)
                 System.out.println((i + 1) + ": " + books.get(i) + ".");

    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
