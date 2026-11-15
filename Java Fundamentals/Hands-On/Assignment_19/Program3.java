//3.Write a program to check whether a number is divisible by 5 and 11 or not.

class Logic
{
    void checkDivisible(int num)
    {
        if( num % 5 == 0 && num % 11 == 0)
        {
            System.out.println("Its Divisible");
        }
        else
        {
            System.out.println("Its not divisible");
        }
    }
}
public class Program3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.checkDivisible(55);
    }
}