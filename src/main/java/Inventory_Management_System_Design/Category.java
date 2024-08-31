package Inventory_Management_System_Design;

import Inventory_Management_System_Design.Items.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Category {

    String category_name;
    Map<Group, List<Product>>  map;

    public Category(String category_name) {
        this.category_name = category_name;
        map = new HashMap<>();
    }

    public void addGroup(Group group)
    {
        map.put(group, new ArrayList<>());
    }

    public void deleteGroup(Group group)
    {
        map.remove(group);
    }

    public boolean addProduct(Group group, Product p)
    {
        if(map.containsKey(group))
        {
            map.get(group).add(p);
            group.noOfProductsInGroup ++;
            return true;
        }
        else
        {
            System.out.println("No group present");
            return false;
        }
    }

    public void deleteProduct(Group group, Product p)
    {
        if(map.containsKey(group))
        {
            map.get(group).remove(p);
            group.noOfProductsInGroup--;
        }
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_name='" + category_name + '\'' +
                '}';
    }
}

