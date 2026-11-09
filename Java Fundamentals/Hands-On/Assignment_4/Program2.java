//2.Write a program which accept number from user and display its factors in
//decreasing order.

import java.util.Scanner;

public class Program2
{
    public static void FactRev(int Num)
    {
        for(int i = Num/2; i > 0;i--)
        {
            if(Num % i == 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sobj.nextInt();

        FactRev(num);
    }
}
