/*
Accept number from user and display below pattern.
Input :4
Output :
1
*
#
2
*
#
3
*
#
4
*

*/

import java.util.Scanner;

class Logic
{
     void Display(int num)
    {
        int cnt = 1;
        while(cnt != num)
            {
                System.out.print("#"+" "+cnt+" * ");
                cnt++;
            } 
    }
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        
        obj.Display(5);
    }
}
