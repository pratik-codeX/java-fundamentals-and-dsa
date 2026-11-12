//1.Write a program which accept number from user and print numbers till that
//number.

import java.util.Scanner;

public class Program2
{
    public static void DisplayPattern(int num)
    {
        for(int i = 1;i <= num;i++)
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
