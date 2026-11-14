//3.Write a program to print all odd numbers up to N.

class Logic
{
    void printOddNumbers(int n)
    {
        for(int i = 1;i <= n;i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }  
}

public class Program3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.printOddNumbers(10);
    }
}