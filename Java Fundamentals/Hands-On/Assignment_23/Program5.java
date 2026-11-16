//.Accept N numbers from user and return product of all odd elements.

import java.util.Scanner;

class Logic
{
    int Product(int arr[])
    {
        int prod = 1;
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] % 2 != 0)
            {
                prod = prod * arr[i];
            }
        }
        return prod;
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

        int iRet = obj.Product(Arr);
        System.out.println(iRet);
    }
}
