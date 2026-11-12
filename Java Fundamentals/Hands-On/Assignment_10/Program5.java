//5.Write a program which accept area in square feet and convert it into square
//meter. (1 square feet = 0.0929 Square meter)

import java.util.Scanner;

public class Program5
{
    public static float SquareMeter(int num)
    {
        if(num < 0)
        {
            num = -num;
        }
        
        return (num * 0.0929f);
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int No = sobj.nextInt();

        System.out.println(SquareMeter(No));
    }
}
