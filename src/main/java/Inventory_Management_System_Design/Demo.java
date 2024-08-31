package Inventory_Management_System_Design;

import Inventory_Management_System_Design.Items.Book;
import Inventory_Management_System_Design.Items.Laptop;
import Inventory_Management_System_Design.Items.MobilePhone;
import Inventory_Management_System_Design.Items.Product;

public class Demo {

    public static void main(String[] args) {

        Inventory ims = new Inventory();

//        System.out.println(ims.inventoryList.get(0).);

        Category electronics = new Category("Electronics");
        Category stationary = new Category("Stationary");

        Group mobiles = new Group("Mobiles");
        Group laptops = new Group("Laptops");
        Group books = new Group("Books");

        Product book1 = new Book("ClassMate Notebook", 40.0d, "White note book", 100);
        Product book2 = new Book("Camlin Notebook", 45.5d, "Rules note book", 80);

        Product mobile1 = new MobilePhone("iPhone 15", 80000.0, "Most secure phone", 6);
        Product mobile2 = new MobilePhone("Samsung S23 Ultra", 90000.0d , "Smart phone with best camera", 8);

        Product laptop1 = new Laptop("Mac Book Air", 120000.0d, "Most powerful laptop", 15.5f);


        electronics.addGroup(mobiles);
        electronics.addGroup(laptops);
        stationary.addGroup(books);

        ims.addCategory(electronics);
        ims.addCategory(stationary);
        ims.addProduct(electronics, mobiles, mobile1);
        ims.addProduct(electronics, mobiles, mobile2);
        ims.addProduct(stationary, books, book1);
        ims.addProduct(stationary,books,book2);
        ims.addProduct(electronics,laptops,laptop1);

        ims.displayProductsByGroup(mobiles);
        ims.deleteProduct(electronics, mobiles, mobile1);
        ims.displayProductsByGroup(mobiles);

    }

}
