//5.Check if number is divisible by 5

import java.util.Scanner;

public class Program5
{
    public static boolean is_divisible_by_five(int iNo)
    {
        if(iNo % 5 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");    
        int num = sobj.nextInt();
        
       System.out.println(is_divisible_by_five(num) ? "Yes" : "No");
    }
}
