import java.util.*;
class BookInfo {
    public static void main(String args[]) {
        Book b1 = new Book();
        b1.setTitle();
        b1.setAuthor();
        b1.setPrice();
        b1.displayInfo();
    }
}
class Book {
    String title;
    String author;
    int price;
    Scanner s = new Scanner(System.in);
    public void setTitle() {
        System.out.print("Enter title of book :");
        title = s.nextLine();
    }
    public void setAuthor() {
        System.out.print("Enter the name of author :");
        author = s.nextLine();
    }
    public void setPrice() {
        System.out.print("Enter the price of book :");
        price = s.nextInt();
    }
    public void displayInfo() {
        System.out.println("...............");
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
    }
}