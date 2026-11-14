//5.Write a program which accept number from user and return difference between
//summation of even digits and summation of odd digits.

import java.util.Scanner;

public class Program5
{
    public static int CountDiff(int No)
    {
        int SumOdd = 0;
        int SumEvn = 0;
        int Digit = 0;

        while(No != 0)
        {
            Digit = No % 10;

            if(Digit % 2 == 0)
            {
                SumEvn = Digit + SumEvn;
            }
            else
            {
                SumOdd = Digit + SumOdd;
            }

            No = No / 10;
        }

        return SumEvn - SumOdd;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");    
        int num = sobj.nextInt();
        
       System.out.println(CountDiff(num));
    }
}
