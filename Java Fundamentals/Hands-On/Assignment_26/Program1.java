//Accept number from user and display below pattern.
/*
Input :5
Output :
A
B
C
D
E
 */

import java.util.Scanner;

class Logic
{
    void Pattern(int arr[],int num)
    {
        char ch = 'A';
        for(int i = 0;i < num;i++)
        {
            System.out.print(ch++);
        }
    }
}

public class Program1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        int Arr[] = new int[6];

        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
    
        obj.Pattern(Arr,n);
    }
}
