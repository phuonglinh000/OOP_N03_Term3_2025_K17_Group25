import java.util.ArrayList;

public class BookList {
    ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> addBook(Book book) {
        books.add(book);
        return books;
    }




    public ArrayList<Book> geteditBook(String bookId, String newTitle, String newAuthor) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).bookId.equals(bookId)) {
                books.get(i).title = newTitle;
                books.get(i).author = newAuthor;
            }
        }
        return books;
    }

    public ArrayList<Book> getdeleteBook(String bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).bookId.equals(bookId)) {
                books.remove(i);
                break;
            }
        }
        return books;
    }

    public void printBookList() {
        for (Book b : books) {
            System.out.println("Mã sách: " + b.bookId + " | Tên sách: " + b.title + " | Tác giả: " + b.author);
        }
    }
}
