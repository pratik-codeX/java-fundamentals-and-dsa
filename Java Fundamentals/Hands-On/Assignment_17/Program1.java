//Write a program to find the sum of digits of a number.

class Logic
{
    void sumOfDigits(int n)
    {
        int digitSum = 0;

        while(n != 0)
        {
            digitSum = n % 10 + digitSum;

            n = n / 10;
        }

        System.out.println(digitSum);
    }
}

public class Program1
{
    
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();

        lobj.sumOfDigits(1023);
    }
}
