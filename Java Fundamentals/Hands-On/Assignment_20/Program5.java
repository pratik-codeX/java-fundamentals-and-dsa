//5.Write a program to find the smallest digit in a given number.

import java.util.Scanner;

class Logic
{
    void findSmallestDigit(int n)
    {
        int digit = 0,smallest = n;

        while(n != 0)
        {
            digit = n % 10;

            if(digit < smallest)
            {
                smallest = digit;
            }
            
            n = n / 10;
        }

        System.out.println(smallest);
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
        

        obj.findSmallestDigit(num);
    }
}
