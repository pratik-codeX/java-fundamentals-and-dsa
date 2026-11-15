//Write a program to calculate the product of digits of a number.

class Logic
{
    void productOfDigits(int num)
    {
        int digit = 0;
        int product = 1;

        while(num != 0)
        {
            digit = num % 10;

            if(digit != 0)
            {
                product = digit * product;
            }

            num = num / 10;
        }
        System.out.println(product);
    }
}

public class Program1
{
    
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.productOfDigits(523);
    }
}
