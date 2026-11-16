//.Accept N numbers from user and accept one another number as NO ,
//return frequency of NO form it.

import java.util.Scanner;

class Logic
{
    int Frequency(int arr[],int num)
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

public class Program5
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

        int iRet = obj.Frequency(Arr,num);
        if(iRet > 0)
        {
            System.out.println("Number Found and its Frequency is : "+iRet);
        }
        else
        {
            System.out.println("Number Not Found");
        }
    }
}
