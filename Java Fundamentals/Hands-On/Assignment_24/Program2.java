//Accept N numbers from user and return the smallest number.

import java.util.Scanner;

class Logic
{
    int Minimun(int arr[])
    {
        int iMin = arr[0];
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] < iMin)
            {
                iMin = arr[i];
            }
        }
        return iMin;
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

        int iRet = obj.Minimun(Arr);
        
        System.out.println(iRet);

    }
}
