import Exception.InvalidBookException;

public class Book {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) throws InvalidBookException {
        if(title == null)
            throw new InvalidBookException("Title connot be empty.");

        if(pageCount < 0)
            throw new InvalidBookException("Page count must be positive");

            this.pageCount = pageCount;
            this.title = title;

    }

    @Override
    public String toString(){
       return "Book: " + title + " (" + pageCount + "pages)";
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }
}
