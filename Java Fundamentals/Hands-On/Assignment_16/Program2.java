//2.Write a program to check whether a given number is even or odd.

import java.util.Scanner;

class Logic
{
    void checkEvenOdd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("Its Even");
        }
        else
        {
            System.out.println("Its Odd");
        }
    }   
}
public class Program2
{
   
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.checkEvenOdd(11);
    }
}