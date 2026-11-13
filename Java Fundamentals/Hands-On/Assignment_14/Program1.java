//Write a program which accept number from user and display its digits in reverse
//order.

import java.util.Scanner;

public class Program1
{
    public static void DisplayDigit(int No)
    {
        if(No < 0)
        {
            No = -No;
        }
        
        int Digit = 0;

        while(No != 0)
        {
            Digit = No % 10;
            System.out.println(Digit);
            No = No / 10;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

        DisplayDigit(number);
    }
}
