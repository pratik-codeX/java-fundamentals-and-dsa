//Write a program to calculate the product of digits of a number.

import java.util.Scanner;

class Logic
{
    void CountEven(int arr[])
    {
        int cnt = 0;
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                cnt++;
            }
        }
        System.out.println("Count of Even is : "+cnt);
    }
}

public class Program1
{
    
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        int Arr[] = new int[5];
        Scanner sobj = new Scanner(System.in);

        for(int i = 0; i < Arr.length;i++)
        {
            System.out.print("Enter Element "+i+" :");
            Arr[i] = sobj.nextInt();
        }

        obj.CountEven(Arr);
    }
}
