//Write a program which accept radius of circle from user and calculate its area.
//Consider value of PI as 3.14. (Area = PI * Radius * Radius)

import java.util.Scanner;

public class Program1
{
    public static double CircleArea(float fRadius)
    {
        return 3.14 * fRadius * fRadius;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        float cnt = sobj.nextFloat();

        System.out.println(CircleArea(cnt));
    }
}
