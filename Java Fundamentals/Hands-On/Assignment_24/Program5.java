//.Accept N numbers from user and display summation of digits of each
//number.

import java.util.Scanner;

class Logic
{
    void DigitsSum(int arr[])
    {
        int digit = 0;
        int digitSum = 0;
        for(int i = 0;i < arr.length;i++)
        {
            while(arr[i] != 0)
            {
                digit = arr[i] % 10;

                digitSum = digit + digitSum;

                arr[i] = arr[i] / 10;

                if(arr[i] == 0)
                {
                    System.out.println(digitSum);
                    digitSum = 0;
                }
            }
        }
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

        obj.DigitsSum(Arr);
    }
}
