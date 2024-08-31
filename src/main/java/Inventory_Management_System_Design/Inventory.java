package Inventory_Management_System_Design;
import Inventory_Management_System_Design.Items.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {

    List<Category> inventoryList;

    public Inventory() {
        inventoryList = new ArrayList<>();
    }

    public void addCategory(Category c)
    {
        inventoryList.add(c);
    }

    public void deleteCategory(Category c)
    {
        inventoryList.remove(c);
    }

    public boolean addProduct(Category category, Group group, Product p)
    {
        if(inventoryList.contains(category))
        {
            category.addProduct(group, p);
            return true;
        }
        else
        {
            System.out.println("No such catrgory is present");
            return false;
        }
    }

    public boolean deleteProduct(Category category, Group group, Product p)
    {
        if(inventoryList.contains(category))
        {
            category.deleteProduct(group, p);
            return true;
        }
        else
        {
            System.out.println("No such catrgory is present");
            return false;
        }

    }

    public List<Product> displayProductsByGroup(Group group)
    {
        for (Category c : inventoryList)
        {
            if(c.map.containsKey(group))
            {
                System.out.println(c.map.get(group));
                return c.map.get(group);
            }
        }
        return null;
    }

    public void displayAllProducts()
    {

        for(Category category : inventoryList)
        {
            System.out.println(category);
            for(Map.Entry<Group, List<Product>> entry :  category.map.entrySet())
            {
                System.out.println("");
                System.out.println(entry.getKey());
                for (Product p : entry.getValue())
                {
                    System.out.println(p.toString());
                }
            }
            System.out.println("");
        }
    }
}
