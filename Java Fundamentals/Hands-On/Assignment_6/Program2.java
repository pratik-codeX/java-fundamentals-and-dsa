//2.Write a program which accept one number from user and check whether that
//number is greater than 100 or not.

import java.util.Scanner;

public class Program2
{
    public static void ChkGreater(int a)
    {
        if(a > 100)
        {
            System.out.println("Its Greater");
        }
        else
        {
            System.out.println("Its Smaller");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sobj.nextInt();

        ChkGreater(num);
    }
}
