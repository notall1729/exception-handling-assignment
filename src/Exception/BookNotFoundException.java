package Exception;

public class BookNotFoundException extends Exception{
    String massage;
    public BookNotFoundException(String massage) {
      super(massage);
    }
}
