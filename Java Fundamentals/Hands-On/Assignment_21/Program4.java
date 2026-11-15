//4.Write a program to count total number of factors of a given number.

import java.util.Scanner;

class Logic
{
    void countFactors(int n)
    {
        int count = 0;

        for(int i= 1;i <= n/2;i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    } 
}

public class Program4
{
    public static void main(String[] args) 
    {
         Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter Number : ");
        int num = sobj.nextInt();

        obj.countFactors(num);
    }
}