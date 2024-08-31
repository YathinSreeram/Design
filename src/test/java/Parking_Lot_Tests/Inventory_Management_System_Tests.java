package Parking_Lot_Tests;

import Inventory_Management_System_Design.Category;
import Inventory_Management_System_Design.Group;
import Inventory_Management_System_Design.Inventory;
import Inventory_Management_System_Design.Items.Book;
import Inventory_Management_System_Design.Items.Laptop;
import Inventory_Management_System_Design.Items.MobilePhone;
import Inventory_Management_System_Design.Items.Product;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Inventory_Management_System_Tests {

    private Category electronics;
    private Category stationary;

    private  Group mobiles;
    private  Group laptops;
    private  Group books;
    Inventory ims;

    Product book1;
    Product book2;

    Product mobile1;
    Product mobile2;

    Product laptop1;

    @BeforeEach
    public void setUp()
    {
        electronics = new Category("Electronics");
        stationary = new Category("Stationary");

        mobiles = new Group("Mobiles");
        laptops = new Group("Laptops");
        books = new Group("Books");

        book1 = new Book("ClassMate Notebook", 40.0d, "White note book", 100);
        book2 = new Book("Camlin Notebook", 45.5d, "Rules note book", 80);

        mobile1 = new MobilePhone("iPhone 15", 80000.0, "Most secure phone", 6);
        mobile2 = new MobilePhone("Samsung S23 Ultra", 90000.0d , "Smart phone with best camera", 8);

        laptop1 = new Laptop("Mac Book Air", 120000.0d, "Most powerful laptop", 15.5f);

        ims = new Inventory();

        electronics.addGroup(mobiles);
        electronics.addGroup(laptops);
        stationary.addGroup(books);
        ims.addCategory(electronics);
        ims.addCategory(stationary);
    }

    @Test
    public void addCategoryTest()
    {

    }

    @Test
    public void addGroupTest()
    {

    }

    @Test
    public void addProductTest()
    {
        assertTrue(ims.addProduct(electronics,mobiles, mobile1));
    }


}
