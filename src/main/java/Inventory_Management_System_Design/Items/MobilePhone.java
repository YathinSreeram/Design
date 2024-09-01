package Inventory_Management_System_Design.Items;

public class MobilePhone extends Product{

    public int ram_in_GB;

    public MobilePhone(String name, double price, String description, int ram_in_GB) {
        super(name, price, description);
        this.ram_in_GB = ram_in_GB;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "ram_in_GB=" + ram_in_GB +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
