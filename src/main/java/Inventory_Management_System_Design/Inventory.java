package Inventory_Management_System_Design;

import Inventory_Management_System_Design.Items.Product;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    public Map<Product, Integer> inventoryMap;

    public Inventory() {
        this.inventoryMap = new HashMap<>();
    }
}
