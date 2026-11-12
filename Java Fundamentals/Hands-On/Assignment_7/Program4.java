//4.Write a program which accepts N from user and print all odd numbers up to N.
import java.util.Scanner;

public class Program4
{
    public static void OddDisplay(int num)
    {
        if(num < 0)
        {
            num = -num;
        }
        
        for(int i = 1;i <= num;i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int cnt = sobj.nextInt();

        OddDisplay(cnt);
    }
}
