/*
2. Write a recursive program which display below pattern.
Output :
5   4   3   2   1
 */

import java.util.Scanner;

class Logic
{
   
    void Display(int i)
    {
        if(i < 0)
        {
            System.out.println();
            return;
        }
            System.out.print(i+" ");
            i--;
    }
    
}

public class Program3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        
        obj.Display(5);
    }
}
