//11.Write a program which accept one number from user and print that number of
//even numbers on screen.
import java.util.Scanner;

public class Program1
{
    public static void DisplayEvn(int A)
    {
        int i = 0,iCnt = 0;
        while(i < A)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
                i++;
            }
            iCnt++;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sobj.nextInt();

        DisplayEvn(num);
    }
}
