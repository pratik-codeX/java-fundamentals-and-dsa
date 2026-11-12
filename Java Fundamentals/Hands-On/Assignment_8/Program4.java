//4.Write a program which accept number from user and display its table.

import java.util.Scanner;

public class Program4
{
    public static void Table(int num)
    {
        if(num < 0)
        {
            num = -num;
        }
        
        for(int i = 1;i <= 10;i++)
        {
            System.out.print(num*i+"  ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int cnt = sobj.nextInt();

        Table(cnt);
    }
}
