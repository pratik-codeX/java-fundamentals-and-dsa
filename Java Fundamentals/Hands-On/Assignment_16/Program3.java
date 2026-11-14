//3.Write a program to find the factorial of a number using a for loop.

import java.util.Scanner;


class Logic
{
    void findFactorial(int num)
    {
        int fact = 1;

        for(int i = 1;i <= num; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial is : "+ fact);
    }
}

public class Program3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.findFactorial(5);
    }
}