//4.Write a program to nd the largest digit in a given number.

import java.util.Scanner;

class Logic
{
    void findLargestDigit(int n)
    {
        int digit = 0,largest = 0;

        while(n != 0)
        {
            digit = n % 10;

            if(digit > largest)
            {
                largest = digit;
            }
            
            n = n / 10;
        }

        System.out.println(largest);
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
        

        obj.findLargestDigit(num);
    }
}