package Vending_Machine_Design.Payment;

public abstract class Payment {
    public PaymentType paymentType;
    public int amount;

    public Payment(PaymentType paymentType, int amount) {
        this.paymentType = paymentType;
        this.amount = amount;
    }
}
