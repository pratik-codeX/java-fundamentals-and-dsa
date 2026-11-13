//2.Write a program which accept range from user and display all even numbers in
//between that range.

import java.util.Scanner;

public class Program2
{
   public static void RangeDisplayEven(int iStart , int iEnd)
    {
        if(iStart > iEnd)
        {
            System.out.println("Invalid Range");
            return;
        }

        while(iStart <= iEnd )
        {
            if( (iStart % 2 == 0))
            {
                System.out.println(iStart);
            }

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

        RangeDisplayEven(start, end);

        
    }
}
