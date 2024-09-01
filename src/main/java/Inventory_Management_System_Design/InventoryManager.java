package Inventory_Management_System_Design;


import Inventory_Management_System_Design.Items.Product;

public class InventoryManager {

    Inventory inventory;

    public InventoryManager(Inventory inventory) {
        this.inventory = inventory;
    }

    public boolean addProduct(Product product)
    {
        if(inventory.inventoryMap.containsKey(product))
            inventory.inventoryMap.put(product, inventory.inventoryMap.get(product) + 1);
        else
            inventory.inventoryMap.put(product, 1);
        return true;
    }

    public boolean removeProduct(Product product)
    {
        if(inventory.inventoryMap.containsKey(product)){
            inventory.inventoryMap.remove(product);
            return true;}
        else{
            System.out.println("No such product");
            return false;
        }
    }

    public int increaseProductQuantity(Product product,int i)
    {
        if(inventory.inventoryMap.containsKey(product))
        {
            inventory.inventoryMap.put(product, inventory.inventoryMap.get(product) + i);
            return inventory.inventoryMap.get(product);
        }
        else {
            return -1;
        }
    }

    public int decreaseProductQuantity(Product product,int i)
    {
        if(inventory.inventoryMap.containsKey(product))
        {
            inventory.inventoryMap.put(product, inventory.inventoryMap.get(product) - i);
            return inventory.inventoryMap.get(product);
        }
        else {
            return -1;
        }
    }
}
