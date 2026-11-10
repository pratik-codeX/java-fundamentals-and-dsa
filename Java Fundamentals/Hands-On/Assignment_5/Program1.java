//1.Check Even or Odd
import java.util.Scanner;

public class Program1
{
    public static boolean CheckEvenOd(int Num)
    {
        boolean Flag = false;

        if(Num % 2 == 0)
        {
            Flag = true;
        }
        return Flag;   
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sobj.nextInt();

        boolean Flag = true;
        if(CheckEvenOd(num))
        {
            System.out.println("Its Even");
        }
        else
        {
            System.out.println("Its Odd");
        }
    }
}
