package Vending_Machine_Design.Products;

public class MilkShake extends Product {
    public MilkShake(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "MilkShake{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
