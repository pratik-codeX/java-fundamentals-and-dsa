//Write a program which accept range from user and display all numbers in between
//that range.
/*
Input : 10 18
Output :10 11 12 13 14 15 16 17 18

Input :90 18
Output : Invalid range
*/

import java.util.Scanner;

public class Program1
{
    public static void RangeDisplay(int iStart , int iEnd)
    {
        if(iStart > iEnd)
        {
            System.out.println("Invalid Range");
            return;
        }

        while(iStart <= iEnd)
        {
            System.out.println(iStart);
            iStart++;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int start = sobj.nextInt();

        System.out.println("Enter Number : ");
        int end = sobj.nextInt();

        RangeDisplay(start, end);
    }
}
