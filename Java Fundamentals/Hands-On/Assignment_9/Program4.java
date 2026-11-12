//4.Write a program to find odd factorial of given number.

import java.util.Scanner;

public class Program4
{
    public static int OddFactorial(int num)
    {
        if(num < 0)
        {
            num = -num;
        }
        
        int Fact = 1;

        for(int i = 1;i <= num;i++)
        {
            if(i % 2 != 0)
            {
                Fact = Fact * i;
            }
        }

        return Fact;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int cnt = sobj.nextInt();

        System.out.println(OddFactorial(cnt));
    }
}
