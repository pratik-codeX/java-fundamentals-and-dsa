//5.Write a program to check whether a number is positive, negative, or zero.

class Logic
{
    void checkSign(int num)
    {
        if(num < 0)
        {
            System.out.println("Its negative");
        }
        else if(num > 0)
        {
            System.out.println("Its positive");
        }
        else
        {
            System.out.println("Its Zero");
        }
    }
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.checkSign(-2);
    }
}
