package Vending_Machine_Design;

import Vending_Machine_Design.Products.Product;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    public Map<Product, Integer> productMap;
    double totalAmountPresent;
    double totalNoOfItems;

    public VendingMachine()
    {
        productMap = new HashMap<>();
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    public double getTotalAmountPresent() {
        return totalAmountPresent;
    }

    public void setTotalAmountPresent(double totalAmountPresent) {
        this.totalAmountPresent = totalAmountPresent;
    }

    public double getTotalNoOfItems() {
        return totalNoOfItems;
    }

    public void setTotalNoOfItems(double totalNoOfItems) {
        this.totalNoOfItems = totalNoOfItems;
    }
}
