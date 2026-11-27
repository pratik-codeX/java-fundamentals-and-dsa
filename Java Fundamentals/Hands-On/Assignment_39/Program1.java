/*
1. Write a recursive program which display below pattern.

Output :
*   *   *   *   *

*/

import java.util.Scanner;

class Logic
{   
    static int i = 5;

    void Display()
    {
        if(i == 0)
        {
            System.out.println();
            return;
        }
        
            System.out.print(" * ");
            i--;
            Display();
        
    }
}

public class Program1
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
       

       obj.Display();
    }
}