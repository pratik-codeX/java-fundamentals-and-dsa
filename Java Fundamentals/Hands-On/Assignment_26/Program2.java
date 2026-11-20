//Accept number from user and display below pattern.

/*
Input :5
Output :5
#
4
#
3
#
2
#
1
#
*/

import java.util.Scanner;

class Logic
{
    void Display(int arr[],int num)
    {
        while(num != 0)
            {
                System.out.print(num+" "+"#"+" ");
                num--;
            } 
    }
}

public class Program2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        int Arr[] = new int[5];
    
        obj.Display(Arr,5);
    }
}
