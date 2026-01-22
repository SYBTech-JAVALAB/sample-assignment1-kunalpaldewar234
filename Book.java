import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    String ISBN;
    int stock;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Stock Level: " + stock);
        System.out.println("Available for purchase: " + isAvailable());
    }

    void Discount(double percentage) {
        price = price - (price * (percentage / 100));
        System.out.println("Applied " + percentage + "% discount to: " + title);
    }

    void restock(int amount) {
        stock += amount;
        System.out.println("Added " + amount + " copies to stock for: " + title);
    }

    boolean isAvailable() {
        return stock > 0;
    }
}
public class Main {
    public static void main(String[] args) {
        
        Book novel = new Book();
        novel.title = "abc";
        novel.author = "abc";
        novel.price = 100;
        novel.ISBN = "3357";
        novel.stock = 5;

        Book textbook = new Book();
        textbook.title = "Java";
        textbook.author = "jp";
        textbook.price = 120.00;
        textbook.ISBN = "ABC-12345";
        textbook.stock = 0; // Currently out of stock
        
        

        System.out.println("--- Initial Inventory ---");
        novel.displayInfo();
        textbook.displayInfo();

        novel.Discount(10); 
        textbook.restock(12);

        System.out.println("\n--- Updated Inventory ---");
        novel.displayInfo();
        textbook.displayInfo();
    }
}
