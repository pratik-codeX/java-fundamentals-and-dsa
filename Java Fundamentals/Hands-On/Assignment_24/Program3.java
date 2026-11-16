//Accept N numbers from user and return the difference between largest
//and smallest number.

import java.util.Scanner;

class Logic
{
    int Difference(int arr[])
    {
        int iMax = arr[0];
        int iMin = arr[0];
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] > iMax)
            {
               iMax = arr[i];
            }
            else if(arr[i] < iMin)
            {
                iMin = arr[i];
            }
        }
        return iMax - iMin;
    }
}

public class Program3
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
        
        System.out.println(obj.Difference(Arr));

    }
}
