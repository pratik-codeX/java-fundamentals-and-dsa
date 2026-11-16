//.Accept N numbers from user and accept one another number as NO ,
//check whether NO is present or not.

import java.util.Scanner;

class Logic
{
    boolean Check(int arr[],int num)
    {
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] == num)
            {
                return true;
            }
        }
        return false;
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

        if(obj.Check(Arr, num))
        {
            System.out.println("Number Found");
        }
        else
        {
            System.out.println("Number Not Found");
        }
    }
}
