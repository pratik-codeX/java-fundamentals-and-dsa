//.Accept number from user and display below pattern.
/*
Input :8
Output :
2
4
6
8
10
12
14
16
*/

import java.util.Scanner;

class Logic
{
    void Display(int table,int num)
    {
        int n = 1;
        while(num != 0)
        {
            System.out.println(n*table);
            num--;
            n++;
        }
    }
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        
        obj.Display(2,8);
    }
}