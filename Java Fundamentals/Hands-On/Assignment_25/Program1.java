/*
Accept N numbers from user and return difference between summation
of even elements and summation of odd elements.
*/

import java.util.Scanner;

class Logic
{
    int Difference(int arr[])
    {
        int oddSum = 0,evenSum = 0;
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                evenSum = evenSum + arr[i];
            }
            else
            {
                oddSum = oddSum + arr[i];
            }
        }
        return (oddSum - evenSum);
    }
}

public class Program1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        int Arr[] = new int[6];
        Scanner sobj = new Scanner(System.in);

        for(int i = 0; i < Arr.length;i++)
        {
            System.out.print("Enter Element "+i+" :");
            Arr[i] = sobj.nextInt();
        }

        System.out.println(obj.Difference(Arr));
    }
}
