//5.Write a program to count the number of digits in a given number.

import java.util.Scanner;

class Logic
{
    void countDigits(int num)
    {
        int count = 0;

        while(num != 0)
        {
            count++;

            num = num / 10;
        }

        System.out.println(count);
    }
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.countDigits(1234);
    }
}
