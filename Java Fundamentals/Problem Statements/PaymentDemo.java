import java.sql.Ref;

abstract class Payment 
{

    protected String transactionId;

    Payment(String transactionId)
    {
        this.transactionId = transactionId;
    }

    abstract void pay(double amount);

    void printReceipt()
    {
        System.out.println("Transaction: " + transactionId);
    }
}

interface Refundable
{
    void refund(double amount);
}

interface SecurePayment 
{
    void authenticate();
}

class UpiPayment extends Payment implements Refundable, SecurePayment 
{

    UpiPayment(String id) 
    {
        super(id);
    }

    @Override
    void pay(double amount) 
    {
        System.out.println("UPI payment: " + amount);
    }

    @Override
    public void refund(double amount)
    {
        System.out.println("Refund: " + amount);
    }

    @Override
    public void authenticate()
    {
        System.out.println("UPI authentication");
    }
}

public class PaymentDemo 
{
    public static void main(String[] args) 
    {
        Payment obj = new UpiPayment("10");
        obj.printReceipt();

        Refundable robj = new UpiPayment("11");
        robj.refund(200);

        SecurePayment sobj = new UpiPayment("22");
        sobj.authenticate();

        UpiPayment uobj = new UpiPayment("100");

        uobj.authenticate();
        uobj.pay(300);
        System.out.println(obj.transactionId);

    }
}