//3.Write a program to check whether a number is a perfect number or not.

import java.util.Scanner;

class Logic
{
    void checkPerfect(int num)
    {
        int sum = 0;
        for(int i = 1;i <= num/2;i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == num)
        {
            System.out.println("Its Perfect Number");
        }
        else
        {
            System.out.println("Its Not Perfect Number");
        }
    }
}
public class Program3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        Logic obj = new Logic();

        System.out.println("Enter Number : ");
        int num = sobj.nextInt();
        
        obj.checkPerfect(num);
    }
}