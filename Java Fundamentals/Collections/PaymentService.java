/*
 Build a small payment hierarchy:
1. Abstract class Payment — transaction ID, constructor, printReceipt(), abstract pay().
2. Interface Refundable — refund().
3. Interface SecurePayment — authenticate().
4. Class UpiPayment — extends Payment, implements both interfaces.
5. Class CardPayment — extends Payment, implements SecurePayment.
Then test both through a Payment[] array.   
*/

import java.util.ArrayList;

abstract class Payment
{
    protected String transactionId;

    Payment(String id)
    {
        this.transactionId = id;
    }

    public void printReceipt()
    {
        System.out.println("Receipt Generated for "+transactionId);
    }

    public abstract double pay(double amt);   
}

interface Refundable
{
    public void refund();
}

interface SecurePayment
{
    public void authenticate();
}

class UpiPayment extends Payment implements Refundable,SecurePayment
{
    UpiPayment(String id)
    {
        super(id);
    }

    @Override 
    public double pay(double amt)
    {
        return amt;
    }

    @Override
    public void refund()
    {
        System.out.println("Refund of UpiPayment");
    }

    @Override
    public void authenticate()
    {
        System.out.println("authentication of UpiPayment");
    }

}

class CardPayment extends  Payment implements SecurePayment
{
    CardPayment(String id)
    {
        super(id);
    }
    @Override 
    public double pay(double amt)
    {
        return amt;
    }

    @Override
    public void authenticate()
    {
        System.out.println("authentication of CardPayment");
    }
}

class PaymentService 
{
    public static void main(String A[]) 
    {
        ArrayList<Payment> payments = new ArrayList<Payment>();

        payments.add(new UpiPayment("UPI101"));
        payments.add(new CardPayment("CARD102"));

        for(Payment payment : payments)
        {
            System.out.println(payment);
        }
    }
}
