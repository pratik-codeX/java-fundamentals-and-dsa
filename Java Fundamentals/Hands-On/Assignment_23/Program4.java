//. Accept N numbers from user and accept Range, Display all elements from
//that range.

import java.util.Scanner;

class Logic
{
    void Range(int arr[],int start,int end)
    {
        for(int i = 0;i < arr.length;i++)
        {
            if(start < arr[i] && end > arr[i])
            {
                System.out.println(arr[i]);
            }
        }
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
        
        obj.Range(Arr,60,90);
        
    }
}
