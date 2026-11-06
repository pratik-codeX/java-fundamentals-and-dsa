//4. Accept one number and check 
// whether is is divisible by 5 or not.

import java.util.Scanner;

public class Program4
{
    public static boolean Check(int A)
    {
        System.out.println(A/5);
        return (A % 5 == 0);
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int No = sobj.nextInt();

        if(Check(No))
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.println("Not Divisible by 5");
        }
        
    }
}
