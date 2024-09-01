package Tests;
import Inventory_Management_System_Design.Inventory;
import Inventory_Management_System_Design.InventoryManager;
import Inventory_Management_System_Design.Items.Book;
import Inventory_Management_System_Design.Items.Laptop;
import Inventory_Management_System_Design.Items.MobilePhone;
import Inventory_Management_System_Design.Items.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Inventory_Management_System_Tests {


    Product book1;
    Product book2;
    Product mobile1;
    Product mobile2;
    Product laptop1;

    Inventory ims ;
    InventoryManager inventoryManager;
    @BeforeEach
    public void setUp()
    {
        book1 = new Book("ClassMate Notebook", 40.0d, "White note book", 100);
        book2 = new Book("Camlin Notebook", 45.5d, "Rules note book", 80);

        mobile1 = new MobilePhone("iPhone 15", 80000.0, "Most secure phone", 6);
        mobile2 = new MobilePhone("Samsung S23 Ultra", 90000.0d , "Smart phone with best camera", 8);

        laptop1 = new Laptop("Mac Book Air", 120000.0d, "Most powerful laptop", 15.5f);

        ims = new Inventory();
        inventoryManager = new InventoryManager(ims);
    }

    @Test
    public void addProductTest()
    {
        assertTrue(inventoryManager.addProduct(book1));
    }

    @Test
    public void removeProductTest()
    {
        ims.inventoryMap.put(laptop1, 2);
        assertTrue(inventoryManager.removeProduct(laptop1));
    }

    @Test
    public void increaseProductQuantityTest()
    {
        ims.inventoryMap.put(laptop1, 2);
        assertEquals(3, inventoryManager.increaseProductQuantity(laptop1, 1));
    }

    @Test
    public void decreaseProductQuantityTest()
    {
        ims.inventoryMap.put(laptop1,4);
        assertEquals(1, inventoryManager.decreaseProductQuantity(laptop1,3));
    }
}
