package Inventory_Management_System_Design.Items;

public abstract class Product {

    String name;
    double price;
    String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
