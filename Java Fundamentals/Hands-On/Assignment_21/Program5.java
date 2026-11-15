//5.Write a program to print all numbers from 1 to N that are divisible by both 2 and 3.

import java.util.Scanner;

class Logic
{
    void printDivisibleBy2and3(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0 && i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    } 
}

public class Program5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter Number : ");
        int num = sobj.nextInt();
        
        obj.printDivisibleBy2and3(num);
    }
}
