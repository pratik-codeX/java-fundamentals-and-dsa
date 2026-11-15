//3.Write a program to display all factors of a given number.

import java.util.Scanner;

class Logic
{
    void displayFactors(int num)
    {
        
        for(int i = 1;i <= num/2;i++)
        {
            if(num % i == 0)
            {
                System.out.println(i);
            }
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
        
        obj.displayFactors(num);
    }
}