package Tests;

import Vending_Machine_Design.ManagerClasses.VendingMachineManager;
import Vending_Machine_Design.Order;
import Vending_Machine_Design.Payment.Cash;
import Vending_Machine_Design.Payment.Payment;
import Vending_Machine_Design.Payment.PaymentType;
import Vending_Machine_Design.Payment.UPIPayment;
import Vending_Machine_Design.Products.Chips;
import Vending_Machine_Design.Products.Chocolate;
import Vending_Machine_Design.Products.MilkShake;
import Vending_Machine_Design.Products.Product;
import Vending_Machine_Design.VendingMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VendingMachineTests {

    VendingMachine vendingMachine;
    Product milkshake1;
    Product milkshake2;
    Product milkshake3;

    Product chips1;
    Product chips2;

    Product chocolate1;
    Product chocolate2;
    Product chocolate3;

    VendingMachineManager vendingMachineManager;

    Order order;

    @BeforeEach
    public void setUp()
    {
        vendingMachine = new VendingMachine();
        vendingMachineManager = new VendingMachineManager(vendingMachine);
        chips1 = new Chips("Lays Classic", 10);
        chips2 = new Chips("Doritos Nacho Cheese", 15);

        chocolate1 = new Chocolate("Dairy Milk", 15);
        chocolate2 = new Chocolate("KitKat", 12);
        chocolate3 = new Chocolate("Snickers", 18);

        milkshake1 = new MilkShake("Strawberry Milkshake", 25);
        milkshake2 = new MilkShake("Chocolate Milkshake", 30);
        milkshake3 = new MilkShake("Vanilla Milkshake", 28);

    }

    @Test
    public void addToMachineTest()
    {
        vendingMachine.productMap.put(chips1,1);
        assertEquals(vendingMachine.productMap, vendingMachineManager.addProductToMachine(chips1));
    }

    @Test
    public void acceptUserRequestTest()
    {
        List<Product> productList = new ArrayList<>();
        productList.add(chips1);
        productList.add(chocolate1);
        productList.add(milkshake1);
        order = new Order(productList);

        Payment cashPayment = new Cash(PaymentType.CASH, 50);
        Payment upiPayment = new UPIPayment(PaymentType.UPI, 75);

        vendingMachine.productMap.put(chips1,2);
        vendingMachine.productMap.put(milkshake1,2);
        vendingMachine.productMap.put(chocolate1,2);

        assertTrue(vendingMachineManager.acceptUserRequest(order,cashPayment));

    }

    @Test
    public void getTotalAmountTest()
    {
        assertEquals(vendingMachine.getTotalAmountPresent(), vendingMachineManager.getAmountAvailable());
    }
}
