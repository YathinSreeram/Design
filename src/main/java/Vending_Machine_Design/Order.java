package Vending_Machine_Design;

import Vending_Machine_Design.Products.Product;

import java.util.List;

public class Order {
    public List<Product> productList;
    public int totalCost;

    public Order(List<Product> productList) {

        this.productList = productList;
    }

}
