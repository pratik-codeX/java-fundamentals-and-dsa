//2..Write a program which accept number from user and check whether it contains 0
//in it or not.

import java.util.Scanner;

public class Program2
{
    public static boolean ChkZero(int No)
    {
        int Digit = 0;
        if(No < 0)
        {
            No = -No;
        }

        while(No != 0)
        {
            Digit = No % 10;

            if(Digit == 0)
            {
                return true;
            }

            No = No / 10;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

        System.out.println(ChkZero(number) ? "Number Contains Zero" : "Number Not Contains Zero");
    }
}