//2.Find Maximum of Two Numbers

import java.util.Scanner;

public class Program2
{
    public static int FindMax(int a,int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
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
