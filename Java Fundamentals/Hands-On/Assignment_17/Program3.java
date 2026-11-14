//3.Write a program to find the maximum of two numbers.

class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a+" is maximum");
        }
        else
        {
            System.out.println(b+" is maximum");
        }
    }
}

public class Program3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.findMax(5,10);
    }
}