import java.util.List;
import java.util.Scanner;

public class User {
    String id;
    String name; 
    String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void Info() {
        System.out.println("ID: " + id);
        System.out.println("Tên người dùng: " + name);
        System.out.println("Email: " + email);
    }
    public void searchBookByTitle(List<Book> books, Scanner scanner) {
        System.out.println("Nhập từ khóa tìm tên sách:");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;

        System.out.println("\n Kết quả tìm kiếm:");
        for (Book book : books) {
            if (book.title.toLowerCase().contains(keyword)) {
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sách nào.");
        }
    }
}

