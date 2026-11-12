//1.Write a program to find factorial of given number.

import java.util.Scanner;

public class Program3
{
    public static int Factorial(int num)
    {
        if(num < 0)
        {
            num = -num;
        }
        
        int Fact = 1;
        for(int i = 1;i <= num ; i++)
        {
            Fact = Fact * i;
        }
        return Fact;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int num = sobj.nextInt();

        System.out.println(Factorial(num));
    }
}
