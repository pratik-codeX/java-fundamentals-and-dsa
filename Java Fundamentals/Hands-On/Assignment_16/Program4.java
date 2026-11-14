//4.Write a program to reverse a number.

import java.util.Scanner;

class Logic
{
    void reverseNumber(int num)
    {
        int rev = 0;
        int digit = 0;

        while(num != 0)
        {
            digit = num % 10;

            System.out.println(digit);

            rev = rev * 10 +  digit;

            num = num / 10;
        }

        System.out.println(rev);
    }
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.reverseNumber(123);
    }
}