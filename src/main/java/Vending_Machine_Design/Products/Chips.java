package Vending_Machine_Design.Products;

public class Chips extends Product {
    public Chips(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Chips{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
