//4. Write a program which accept number from user and return summation of all its
//non factors.

import java.util.Scanner;

public class Program4
{
    public static int SumNonFact(int A)
    {
        int iSum = 0;
       for(int i = 1;i < A;i++)
        {
            if(A % i != 0)
            {
                iSum += i;
            }
        }
        return iSum;   
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int No = sobj.nextInt();

       System.out.println(SumNonFact(No));
    }
}
