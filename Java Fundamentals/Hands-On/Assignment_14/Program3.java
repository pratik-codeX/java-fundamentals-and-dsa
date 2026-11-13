//3.Write a program which accept number from user and count frequency of 2 in it

import java.util.Scanner;

public class Program3
{
     public static int CountTwo(int No)
    {
        int cnt = 0;
        int Digit = 0;

        while(No != 0)
        {
            Digit = No % 10;

            if(Digit == 2)
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
        int number = sobj.nextInt();

        System.out.println("Cont is : "+CountTwo(number));
    }
}