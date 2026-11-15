//Write a program to check whether a given year is a leap year or not.

class Logic
{
    void checkLeapYear(int num)
    {
        if(num % 4 == 0)
        {
            System.out.println("Its Leap Year");
        }
        else
        {
            System.out.println("Its Not Leap Year");
        }
    }
}

public class Program1
{
    
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.checkLeapYear(2028);
    }
}
