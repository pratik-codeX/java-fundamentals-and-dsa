//2.Write a program to print numbers from N down to 1 in reverse order.

import java.util.Scanner;

class Logic
{
    void printReverse(int n)
    {
        for(int i = n;i != 0;i--)
        {
            System.out.println(i);
        }
    }  
}
public class Program2
{
   
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Marks : ");
        int num = sobj.nextInt();

        obj.printReverse(num);
    }
}