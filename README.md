# Quan ly Sach

# 03 đối tượng




## câu 2  : 
class Book {
  String id;
  String title;
  String author;
  String category;  
}


class Librarian {
  String id;
  String name;
  String email;
  String phoneNumber;
}

class User {
  String id;
  String name;
  String email;
  String role; 
}
## câu 3 : 
src 
    Book.java 
    User.java
    Admin.java
test 
    BookTest.java
    AdminTest.java
    UserTest.java
README.md

câu 4 : 
public class Admin {
    String adminId;
    String name;

    public Admin(String adminId, String name) {
        this.adminId = adminId;
        this.name = name;
    }

    public void addBook(Book book) {
        System.out.println("Admin " + name + " thêm sách: " + book.title);
    }

    public void removeBook(Book book) {
        System.out.println("Admin " + name + "  xóa sách: " + book.title);
    }
}

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
}

public class Book {
    String bookId;
    String title;
    String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
    }
}

## câu 5 : 
public class UserTest { public static void main(String[] args) {

    User user = new User("01", "Bạch Phương Linh", "linh@gmail.com");
    
    user.Info();
}
}


