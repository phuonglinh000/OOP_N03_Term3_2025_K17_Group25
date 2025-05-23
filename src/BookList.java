import java.util.ArrayList;

public class BookList {
    ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> addBook(Book book) {
        books.add(book);
        return books;
    }
}


