//Write a program which accept number from user and return the count of even
//digits.

import java.util.Scanner;

public class Program1
{
    public static int CountEven(int No)
    {
        if(No < 0)
        {
            No = -No;
        }
        
        int Cnt = 0;
        int Digit = 0;

        while(No != 0)
        {
            Digit = No % 10;

            if(Digit % 2 == 0)
            {
                Cnt++;
            }
            //System.out.println(Digit);
            No = No / 10;
        }
        return Cnt;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

        System.out.println(CountEven(number));
    }
}
