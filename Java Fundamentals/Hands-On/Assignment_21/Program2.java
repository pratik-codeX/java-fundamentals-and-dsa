//2.Write a program to count how many even and odd numbers are present between 1 and N.

import java.util.Scanner;

class Logic
{
    void countEvenOddRange(int n)
    {
        int oddCount = 0;
        int evenCount = 0;

        for(int i = 1;i <= n;i++)
        {
            if(i % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        System.out.println("Even Count : "+evenCount+" and "+"Odd Count : "+oddCount);
    }  
}
public class Program2
{
   
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sobj.nextInt();

        obj.countEvenOddRange(num);
    }
}