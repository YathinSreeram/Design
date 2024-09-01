package Vending_Machine_Design.Payment;

public class Cash extends Payment {
    public Cash(PaymentType paymentMode, int amount) {
        super(PaymentType.CASH, amount);
    }
}