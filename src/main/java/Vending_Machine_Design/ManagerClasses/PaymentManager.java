package Vending_Machine_Design.ManagerClasses;

import Vending_Machine_Design.Payment.Payment;

public class PaymentManager {

    Payment payment;

    public PaymentManager(Payment payment) {
        this.payment = payment;
    }

    public boolean validatePayment(int amountToBePaid)
    {
        if(payment.amount == amountToBePaid)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
