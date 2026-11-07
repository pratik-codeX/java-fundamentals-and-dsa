//4. Accept two numbers from user and display first number in second
//number of times.

import java.util.Scanner;

public class Program4
{
    public static void Display(int A,int Count)
    {
        if(Count < 0)
        {
            Count = -Count;
        }

        for(int i = 0;i < Count; i++)
        {
            System.out.print(A);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int No = sobj.nextInt();

        System.out.println("Enter Number : ");
        int Count = sobj.nextInt();

       Display(No, Count);
    }
}
