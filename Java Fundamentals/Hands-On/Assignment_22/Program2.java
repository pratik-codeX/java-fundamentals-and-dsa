//Accept N numbers from user and return difference between frequency of
//even number and odd numbers.

import java.util.Scanner;

class Logic
{
    void CountEvenOdd(int arr[])
    {
        int cntOdd = 0,cntEven = 0 ;
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                cntOdd++;
            }
            else
            {
                cntEven++;
            }
        }
        System.out.println("Count of Even is : "+cntEven);
        System.out.println("Count of Odd is : "+cntOdd);
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

        obj.CountEvenOdd(Arr);
    }
}
