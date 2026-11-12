//4.Write a program which accept N and print first 5 multiples of N.
import java.util.Scanner;

public class Program5
{
    public static void MultipleDisplay(int num)
    {
        if(num < 0)
        {
            num = -num;
        }
        int mult = 1;
        
        for(int i = 1;i <= 5;i++)
        {
            mult = num * i;
            System.out.println(mult);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int cnt = sobj.nextInt();

        MultipleDisplay(cnt);
    }
}
