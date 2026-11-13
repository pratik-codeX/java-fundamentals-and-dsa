//4.Write a program which accept number from user and count frequency of 4 in it.

import java.util.Scanner;

public class Program4
{
    public static int CountFour(int No)
    {
        int cnt = 0;
        int Digit = 0;
        if(No < 0)
        {
            No = -No;
        }

        while(No != 0)
        {
            Digit = No % 10;

            if(Digit == 4)
            {
                System.out.println(Digit);
                cnt++;
            }

            No = No / 10;
        }

        return cnt;
        
    }    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

        System.out.println(CountFour(number));

    }
}