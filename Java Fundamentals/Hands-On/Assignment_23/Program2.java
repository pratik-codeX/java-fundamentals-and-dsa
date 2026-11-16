//Accept N numbers from user and accept one another number as NO ,
//return index of first occurrence of that NO.

import java.util.Scanner;

class Logic
{
    int Check(int arr[],int num)
    {
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] == num)
            {
                return i;
            }
        }
        return -1;
    }
}

public class Program2
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

        int iRet = obj.Check(Arr, num);
        
        System.out.println(iRet);

    }
}
