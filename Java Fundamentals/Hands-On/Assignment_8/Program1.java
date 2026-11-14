//1.Write a program which accept number from user and display below pattern.

//* *   *   *   *   #   #   #   #   #

import java.util.Scanner;

public class Program1
{
    public static void Display(int num)
    {
        if(num < 50)
        {
            System.out.println("Small");
        }
        else if(num >= 50 & num <= 100)
        {
            System.out.println("Medium");
        }
        else
        {
            System.out.println("Large");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int cnt = sobj.nextInt();

        Number(cnt);
    }
}
