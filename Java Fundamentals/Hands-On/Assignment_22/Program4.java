//. Accept N numbers from user and return frequency of 11 form it.

import java.util.Scanner;

class Logic
{
    int Frequency(int arr[])
    {
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] == 11)
            {
                return i;
            }
        }
        return -1;
    }
}

public class Program4
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
        
        int iRet = obj.Frequency(Arr);
        if(iRet > 0)
        {
            System.out.println(iRet);
        }
        else
        {
            System.out.println("Number Not Found");
        }
    }
}
