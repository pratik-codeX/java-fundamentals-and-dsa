//Accept N numbers from user and return the largest number.

import java.util.Scanner;

class Logic
{
    int Maximum(int arr[])
    {
        int iMax = arr[0];
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] > iMax)
            {
                iMax = arr[i];
            }
        }
        return iMax;
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
        
        System.out.println("Enter Number to Find : ");
        int num = sobj.nextInt();

        System.out.println(obj.Maximum(Arr));
    }
}
