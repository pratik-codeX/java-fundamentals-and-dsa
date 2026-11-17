interface UPI 
{
    void payUsingUPI(double amount);
}

interface Card 
{
    void payUsingCard(double amount);
}

class PaymentService implements UPI, Card 
{

    @Override 
    public void payUsingCard(double amt)
    {
        System.out.println("Payment using Card : "+amt);
    }

    @Override 
    public void payUsingUPI(double amt)
    {
        System.out.println("Payment using UPI : "+amt);
    }
}

public class PaymentSystem 
{
    public static void main(String[] args) 
    {
        PaymentService service = new PaymentService();

        //UPI upi = service;
        Card card = service;

       UPI upi = new PaymentService();
        
        upi.payUsingUPI(500);
        card.payUsingCard(1000);

        //service.payUsingUPI(1000);
    }   
}
