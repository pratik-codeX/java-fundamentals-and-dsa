//4.Write a program which accept number from user and return multiplication of all
//digits.

import java.util.Scanner;

public class Program4
{
    public static int MultDigits(int No)
    {
        int Mult = 1;
        int Digit = 0;
        if(No < 0)
        {
            No = -No;
        }

        while(No != 0)
        {
            Digit = No % 10;

            if(Digit != 0)
            {
                Mult = Mult * Digit;   
            }

            No = No / 10;
        }

        return Mult;
        
    }    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

        System.out.println(MultDigits(number));

    }
}