//5.Write a program which accept number from user and count frequency of such a
//digits which are less than 6.

import java.util.Scanner;

public class Program5
{
    public static int Count(int No)
    {
        int cnt = 0;
        int Digit = 0;

        while(No != 0)
        {
            Digit = No % 10;

            if(Digit < 6)
            {
                cnt++;
            }

            No = No / 10;
        }
        return cnt;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");    
        int num = sobj.nextInt();
        
       System.out.println(Count(num));
    }
}
