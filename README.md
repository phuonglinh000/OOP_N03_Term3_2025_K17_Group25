# Quan ly thu vien sach 

# 03 đối tượng




## Các đối tượng quản lý sách  : 
```
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
```


## Folder Source Code của Project: 
```
src (
    Book.java 
    User.java
    Admin.java)
test (
    BookTest.java
    AdminTest.java
    UserTest.java)
README.md
```


Chương trình chính App.java (Main Program)
```
public class App {
    public static void main(String[] args){
        System.out.println("test main");

        ex21_QA.test();
        TestEx3_QA.test();

    }
}

```
# Chi tiết kiểu mô tả của các đối tượng
```
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
```
## Kiểm định (test)
```
public class TestEx3_QA {

    // bien

    // phuongthuc

    public static void test() {

        ex3_QA obj = new ex3_QA();

        System.out.println("test khoi tao object kieu ex3_QA"+obj);
        User u = new User("id01", "Quynh Anh", "qa@gmail.com");
        u.Info();
    }

}

```
## Class Diagram
![image](https://github.com/user-attachments/assets/84a78b2f-ab84-4a76-b70e-d883113c97d8)

## thêm sách
public class Book {
    String title;
    String author;
    int year;
    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

import java.util.ArrayList;
public class BookList {
    ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> addBook(Book book) {
        books.add(book);
        return books;
    }
}
## activity datagram 

![image](https://github.com/user-attachments/assets/b9061d96-6193-466b-b862-cd8b7d0bdfe1)

## 3 phương thức hoạt động chính 
    + Tìm kiếm sách 
    + Cho mượn sách 
    + Thêm sách

## Mượn sách  
 // Khởi tạo đối tượng MuonSach mới với mã sách và mã thành viên
   public MuonSach(String var1, String var2) {
      this.maSach = var1;
      this.maThanhVien = var2;
      this.ngayMuon = LocalDate.now();
      this.ngayHetHan = this.ngayMuon.plusDays(14L);
   }
   
// Trả về mã sách.
   public String getMaSach() {
      return this.maSach;
   }
// Trả về mã thành viên.
   public String getMaThanhVien() {
      return this.maThanhVien;
   }
   
// Trả về ngày mượn.
   public LocalDate getNgayMuon() {
      return this.ngayMuon;
   }

// Trả về ngày hết hạn.
   public LocalDate getNgayHetHan() {
      return this.ngayHetHan;
   }

// Cập nhật ngày hết hạn mượn sách.
   public void setNgayHetHan(LocalDate var1) {
      this.ngayHetHan = var1;
   }
// Trả về chuỗi mô tả đầy đủ thông tin của phiếu mượn sách.
   public String toString() {
      return "Ma thanh vien: " + this.maThanhVien + " | Ma sach: " + this.maSach + " | Ngay cho muon: " + this.ngayMuon + " | Ngay het han: " + this.ngayHetHan;
   }
}

