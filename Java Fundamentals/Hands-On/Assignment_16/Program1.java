//Write a program to calculate the sum of first N natural numbers.

import java.util.Scanner;

class Logic
{
    void calculateSum(int n)
    {
        int sum = 0;

        for(int i = 0; i <= n;i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

public class Program1
{
    
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();

        lobj.calculateSum(10);
    }
}
