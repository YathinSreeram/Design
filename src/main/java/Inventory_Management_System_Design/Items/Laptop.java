package Inventory_Management_System_Design.Items;

public class Laptop extends Product{

    float screenSizeInInches;

    public Laptop(String name, double price, String description, float screenSizeInInches) {
        super(name, price, description);
        this.screenSizeInInches = screenSizeInInches;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenSizeInInches=" + screenSizeInInches +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

