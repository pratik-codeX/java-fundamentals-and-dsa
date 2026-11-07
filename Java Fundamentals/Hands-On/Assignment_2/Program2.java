//1.Accept one number from user and print that number of * on screen.
import java.util.Scanner;

public class Program2
{
    public static void Display(int A)
    {
        for(int i = 0; i < A;i++)
        {
            System.out.print("*");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sobj.nextInt();

        Display(num);
    }
}
