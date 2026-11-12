//4.Write a program which accept number from user and display its table in reverse
//order

import java.util.Scanner;

public class Program5
{
    public static void Table(int num)
    {
        if(num < 0)
        {
            num = -num;
        }
        
        for(int i = 10;i >= 1;i--)
        {
            System.out.println(num*i);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int No = sobj.nextInt();

        Table(No);
    }
}
