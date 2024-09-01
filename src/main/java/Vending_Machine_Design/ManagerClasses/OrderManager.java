package Vending_Machine_Design.ManagerClasses;

import Vending_Machine_Design.Order;
import Vending_Machine_Design.Products.Product;

public class OrderManager {
    Order order;

    OrderManager(Order order)
    {
        this.order = order;
    }

    public int calculateTotalCost()
    {
        for(Product p : order.productList)
        {
            order.totalCost = order.totalCost + p.price;
        }
        return order.totalCost;
    }

}
