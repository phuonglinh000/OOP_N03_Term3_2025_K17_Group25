public class BookListTest {
    public static void test() {
        BookList bookList = new BookList();

        bookList.addBook(new Book("B01", "Lập trình C", "Nguyễn Thị Quỳnh Anh"));
        bookList.addBook(new Book("B02", "Lập trình Python", "Nguyễn Thị Quỳnh Anh"));
        printAll(bookList, "Danh sách sách ban đầu:");

        bookList.geteditBook("B02", "Lập trình Python nâng cao", "Nguyễn Thị Quỳnh Anh");
        printAll(bookList, "Danh sách sách sau khi sửa:");
        
        bookList.getdeleteBook("B01");
        printAll(bookList, "Danh sách sách sau khi xóa:");
    }

    private static void printAll(BookList bookList, String message) {
        System.out.println("\n" + message);
        bookList.printBookList();
    }
}
