//3.Write a program which accept distance in kilometre and convert it into meter. (1
//kilometre = 1000 Meter)    

import java.util.Scanner;

public class Program3
{
    public static int KMtoMeter(int num)
    {
        if(num < 0)
        {
            num = -num;
        }

        return num * 1000;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int num = sobj.nextInt();

        System.out.println(KMtoMeter(num));
    }
}