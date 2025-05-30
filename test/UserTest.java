import java.util.Scanner;
public class UserTest {
    public static void test() {
        BookList bookList = new BookList();
        bookList.addBook(new Book("B01", "Lập trình C", "Nguyễn Thị Quỳnh Anh"));
        bookList.addBook(new Book("B02", "Lập trình Python", "Nguyễn Thị Quỳnh Anh"));
        User user = new User("A01", "Nguyễn Thị Quỳnh Anh", "a@gmail.com");
        user.Info();
        Scanner scanner = new Scanner(System.in);
        user.searchBookByTitle(bookList.books, scanner);
    }
}
