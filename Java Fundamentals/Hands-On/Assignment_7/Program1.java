//1.Write a program which accept number from user and print that number of $ & *
//on screen.
import java.util.Scanner;

public class Program1
{
    public static void DisplayPattern(int num)
    {
        for(int i = 0;i < num;i++)
        {
            System.out.print("$"+" "+"*"+" ");
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
