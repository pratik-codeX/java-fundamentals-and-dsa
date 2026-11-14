//4.Write a program to find the sum of even and odd digits separately in a number.

class Logic
{
    void sumEvenOddDigits(int n)
    {
        int evn = 0,odd = 0;
        for(int i = 1;i <= n;i++)
        {
            if(i % 2 == 0)
            {
                evn = evn+i;
            }
            else
            {
                odd = odd+i;
            }
        }
        System.out.println("Sum of Odd : "+ odd);
        System.out.println("Sum of Even : "+ evn);
    } 
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.sumEvenOddDigits(10);
    }
}