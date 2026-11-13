//4..Write a program which accept range from user and return addition of all even
//numbers in between that range. (Range should contains positive numbers only)

import java.util.Scanner;

public class Program4
{
    public static int RangeSumEven(int iStart , int iEnd)
    {
        if(iStart > iEnd)
        {
            System.out.println("Invalid Range");
            return 0;
        }

        int Sum = 0;
        while(iStart <= iEnd)
        {
            if((iStart % 2 == 0))
            {
                Sum = iStart + Sum;
            }

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

        System.out.println(RangeSumEven(start, end));
    }
}
