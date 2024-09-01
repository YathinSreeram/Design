package Vending_Machine_Design.ManagerClasses;

import Vending_Machine_Design.Order;
import Vending_Machine_Design.Payment.Payment;
import Vending_Machine_Design.Products.Product;
import Vending_Machine_Design.VendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VendingMachineManager {

    VendingMachine vendingMachine;

    public VendingMachineManager(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    public Map<Product, Integer> addProductToMachine(Product p)
    {
        if(vendingMachine.productMap.containsKey(p))
        {
            vendingMachine.productMap.put(p, vendingMachine.productMap.get(p)+1);
            return vendingMachine.productMap;
        }
        else {
            vendingMachine.productMap.put(p,1);
            return vendingMachine.productMap;
        }
    }

    public Map<Product,Integer> removeProductFromMachine(Product p)
    {
        if(vendingMachine.productMap.containsKey(p))
        {
            vendingMachine.productMap.remove(p);
            return vendingMachine.productMap;
        }
        else
        {
            System.out.println("No such product");
            return vendingMachine.productMap;
        }
    }

    public double getAmountAvailable()
    {
        return vendingMachine.getTotalAmountPresent();
    }

    public boolean acceptUserRequest(Order order, Payment payment)
    {
        List<Product> listOfProductsForUser = new ArrayList<>();
        OrderManager orderManager = new OrderManager(order);
        PaymentManager paymentManager = new PaymentManager(payment);

        for (Product p : order.productList)
        {
            if(vendingMachine.productMap.get(p) >= 1)
            {
                continue;
            }
            else {
                return false;
            }
        }

        if(paymentManager.validatePayment(orderManager.calculateTotalCost())){
            for (Product p : order.productList)
            {
                vendingMachine.productMap.replace(p, vendingMachine.productMap.get(p) - 1);
                listOfProductsForUser.add(p);
            }
            return true;
        }
        return false;

    }

}
