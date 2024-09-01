package Vending_Machine_Design.Payment;

public class UPIPayment extends Payment{
    public UPIPayment(PaymentType paymentMode, int amount) {
        super(PaymentType.UPI, amount);
    }
}
