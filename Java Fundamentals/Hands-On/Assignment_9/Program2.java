//2.Accept amount in US dollar and return its corresponding value in Indian currency.
//Consider 1$ as 70 rupees.
import java.util.Scanner;

public class Program2
{
    public static float DollarToINR(int num)
    {
        return num * 70;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int cnt = sobj.nextInt();

        System.out.println(DollarToINR(cnt));
    }
}
