//3.Write a program which accept range from user and return addition of all numbers
//in between that range. (Range should contains positive numbers only)

import java.util.Scanner;

public class Program3
{
    public static int RangeSum(int iStart,int iEnd)
    {
        if((iStart < 0 && iStart < iEnd) || iStart > iEnd)
        {
            System.out.println("Invalid Range");
            return 0;
        }

        int Sum = 0;
        while(iStart <= iEnd)
        {
            Sum = iStart + Sum;
            iStart++;
        }

        return Sum;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int start = sobj.nextInt();

        System.out.println("Enter Number : ");
        int end = sobj.nextInt();

        System.out.println(RangeSum(start,end));
    }
}