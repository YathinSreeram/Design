package Vending_Machine_Design.Products;

public class Chocolate extends Product {

    public Chocolate(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
