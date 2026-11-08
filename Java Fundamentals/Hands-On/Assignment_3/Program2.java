//1.Write a program which accept number from user and print even factors of that
//number.
import java.util.Scanner;

public class Program2
{
    public static void DisplayEvnFact(int A)
    {
        if(A < 0)
        {
            A = -A;
        }

       for(int i = 1;i < A; i++)
       {
            if((A % i == 0) && (i % 2 == 0))
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

        DisplayEvnFact(num);
    }
}
