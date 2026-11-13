//5.Write a program which accept accept range from user and display all numbers in
//between that range in reverse order.

import java.util.Scanner;

public class Program5
{
    public static void RangeDisplayRev(int iStart,int iEnd)
    {
        if(iStart > iEnd)
        {
            System.out.println("Invalid Number");
            return;
        }
        while(iEnd >= iStart)
        {
            System.out.println(iEnd);
            iEnd--;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");    
        int start = sobj.nextInt();
    
        System.out.println("Enter Number : ");
        int end = sobj.nextInt();

        RangeDisplayRev(start, end);
    }
}
