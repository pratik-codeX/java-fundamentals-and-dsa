//1.Write a program which accept number from user and if number is less than 50
//then print small , if it is greater than 50 and less than 100 then print medium, if it is
//greater than 100 then print large.

import java.util.Scanner;

public class Program1
{
    public static void Number(int num)
    {
        if(num < 50)
        {
            System.out.println("Small");
        }
        else if(num >= 50 & num <= 100)
        {
            System.out.println("Medium");
        }
        else
        {
            System.out.println("Large");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int cnt = sobj.nextInt();

        Number(cnt);
    }
}
