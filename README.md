# Quan ly Sach

# 03 đối tượng





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

câu 4 : 
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

public class UserTest {
    public static void main(String[] args) {
       
        User user = new User("01", "Bạch Phương Linh", "linh@gmail.com");
        
        user.Info();
    }
}
