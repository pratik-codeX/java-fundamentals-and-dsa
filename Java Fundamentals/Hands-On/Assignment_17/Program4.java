//4.Write a program to find the minimum of three numbers.

class Logic
{
    void findMin(int a, int b, int c)
    {
        if(a < b && a < c)
        {
            System.out.println(a +" is minimum");
        }
        else if(b < a && b < c)
        {
            System.out.println(b + " is minimum");
        }
        else
        {
            System.out.println(c + " is minimum");
        }
    }
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.findMin(5,2,1);
    }
}