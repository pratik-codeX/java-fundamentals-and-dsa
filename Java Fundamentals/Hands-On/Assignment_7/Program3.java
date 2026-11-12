//1.Write a program which accept number from user and print its numbers line.

import java.util.Scanner;

public class Program3
{
    public static void DisplayPattern(int num)
    {
        if(num < 0)
        {
            num = -num;
        }
        
        for(int i = -num;i <= num;i++)
        {
            System.out.print(i+"\t");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int cnt = sobj.nextInt();

        DisplayPattern(cnt);
    }
}
