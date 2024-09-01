package Inventory_Management_System_Design.Items;

public class Book extends Product{

    public int no_of_pages;

    public Book(String name, double price, String description, int no_of_pages) {
        super(name, price, description);
        this.no_of_pages = no_of_pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "no_of_pages=" + no_of_pages +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
