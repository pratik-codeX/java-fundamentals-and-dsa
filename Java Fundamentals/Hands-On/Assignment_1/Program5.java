//5. Accept one number from user and print that number of * on screen.

import java.util.Scanner;

public class Program5
{
    public static void Display(int A)
    {
        for(int i = 0; i < A; i++)
        {
            System.out.println("*");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int No = sobj.nextInt();

        Display(No);
        
    }
}
