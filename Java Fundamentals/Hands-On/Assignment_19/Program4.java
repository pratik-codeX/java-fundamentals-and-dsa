//4.Write a program to print each digit of a number separately.

class Logic
{
    void printDigits(int n)
    {
        int digit = 0;

        while(n != 0)
        {
            digit = n % 10;

            System.out.println(digit);
            n = n / 10;
        }
    } 
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.printDigits(145);
    }
}