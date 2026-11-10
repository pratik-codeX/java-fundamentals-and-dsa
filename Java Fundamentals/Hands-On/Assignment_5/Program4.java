//4. Check Positive, Negative, or Zero

import java.util.Scanner;

public class Program4
{
    public static void CheckNumberType(int num)
    {
        if(num > 0)
        {
            System.out.println("Its Positive");
        }
        else if(num < 0)
        {
            System.out.println("Its Negagive");
        }
        else
        {
            System.out.println("It is Zero");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int No = sobj.nextInt();

       CheckNumberType(No);
    }
}
