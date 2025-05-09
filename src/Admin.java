public class Admin {
    String adminId;
    String name;

    public Admin(String adminId, String name) {
        this.adminId = adminId;
        this.name = name;
    }

    public void addBook(Book book) {
        System.out.println("Admin " + name + "thêm sách: " + book.title);
    }

    public void removeBook(Book book) {
        System.out.println("Admin " + name + " xóa sách: " + book.title);
    }
}
