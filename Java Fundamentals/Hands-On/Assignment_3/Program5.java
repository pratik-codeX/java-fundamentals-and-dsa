//5. Accept number from user and check whether number is even or odd.
import java.util.Scanner;

public class Program5
{
    public static boolean CheckEvnOdd(int A)
    {
        return (A % 2 == 0);
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int No = sobj.nextInt();

        if(CheckEvnOdd(No))
        {
            System.out.println("Even");
        }        
        else
        {
            System.out.println("Odd");
        }
    }
}
